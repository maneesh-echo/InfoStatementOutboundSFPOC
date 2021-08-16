package com.echo;

import com.salesforce.functions.jvm.sdk.Context;
import com.salesforce.functions.jvm.sdk.InvocationEvent;
import com.salesforce.functions.jvm.sdk.SalesforceFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.xml.bind.JAXBException;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.util.IOUtils;
import com.echo.model.FunctionInput;
import com.echo.model.FunctionOutput;
import com.echo.model.agency.CertificateType;
import com.echo.model.agency.CustodianResponse;
import com.echo.model.agency.CustodianResponse.CustodianReferences;
import com.echo.model.agency.CustodianResponse.OrderStatus;
import com.echo.model.agency.CustodianResponses;
import com.echo.model.agency.MessageType;
import com.echo.model.agency.OrderStatusCode;
import com.echo.util.JaxbUtil;
import com.amazonaws.auth.AWSStaticCredentialsProvider;

/**
 * Describe IssueinfostatementFunction here.
 */
public class IssueinfostatementFunction implements SalesforceFunction<FunctionInput, FunctionOutput> {
	private static final Logger LOGGER = LoggerFactory.getLogger(IssueinfostatementFunction.class);

	@Override
	public FunctionOutput apply(InvocationEvent<FunctionInput> event, Context context) throws Exception {

		FunctionOutput output = new FunctionOutput();
		output.setRequestNumber(event.getData().getRequestNumber());

		try {
			String accessKey = System.getenv("accesskey");
			String secretKey = System.getenv("secretkey");
			String region = System.getenv("region");
			String encodedPDFString = getPDFFromS3(accessKey, secretKey, region, event.getData().getPdfBucket(),
					event.getData().getPdfKey());
			AgencySoapClient soapClient = new AgencySoapClient();
			soapClient.sendPDFToAgency(createCustodianResponse(event.getData()), encodedPDFString, event.getData(),
					output);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return output;
	}

	private String getPDFFromS3(String accessKey, String secretKey, String region, String bucket, String key)
			throws Exception {
		LOGGER.info("Read PDF from {}/{}", bucket, key);

		BasicAWSCredentials basicAWSCredentials = new BasicAWSCredentials(accessKey, secretKey);
		AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
				.withCredentials(new AWSStaticCredentialsProvider(basicAWSCredentials)).withRegion(region)
				.withForceGlobalBucketAccessEnabled(true).build();
		S3Object s3Object = s3Client.getObject(bucket, key);
		InputStream objectData = s3Object.getObjectContent();
		byte[] dataArr = IOUtils.toByteArray(objectData);
		LOGGER.info("Data len " + dataArr.length);
		objectData.close();
		LOGGER.info("Closing stream");
		return new String(Base64.getEncoder().encode(dataArr));
	}

	private String createCustodianResponse(FunctionInput message) throws JAXBException {
		CustodianResponses custodianResponses = new CustodianResponses();
		CustodianResponse custodianResponse = new CustodianResponse();
		custodianResponse.setAgentReference(message.getSolicitorReference());
		OrderStatus orderStatus = new OrderStatus();
		custodianResponse.setMessageType(MessageType.CER);
		custodianResponse.setCertificateType(CertificateType.PDF);
		orderStatus.setCode(OrderStatusCode.COMPLETED);
		orderStatus.setValue(OrderStatusCode.COMPLETED.value());
		custodianResponse.setOrderStatus(orderStatus);
		custodianResponse.setTimeStamp(
				DateTimeFormatter.ISO_DATE_TIME.format(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS)));
		CustodianReferences custodianReferences = new CustodianReferences();
		custodianReferences.getCustodianReference().add(message.getRequestNumber());
		custodianResponse.setCustodianReferences(custodianReferences);
		custodianResponses.getCustodianResponse().add(custodianResponse);
		return JaxbUtil.objectToXMLString(CustodianResponses.class, custodianResponses);
	}

}
