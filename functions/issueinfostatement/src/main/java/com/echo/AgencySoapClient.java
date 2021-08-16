package com.echo;

import javax.xml.ws.Holder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.echo.model.FunctionInput;
import com.echo.model.FunctionOutput;
import com.echo.model.PDFTarget;

import au.gov.vic.landata.portal1.agencywebservices._1_10.ProvisioningLanData;
import au.gov.vic.landata.portal1.agencywebservices._1_10.provisioning.ArrayOfString;
import au.gov.vic.landata.portal1.agencywebservices._1_10.provisioning.Provisioning110;
import au.gov.vic.landata.portal1.agencywebservices._1_10.provisioning.ProvisioningSAI;

public class AgencySoapClient {

	private final Logger log = LoggerFactory.getLogger(AgencySoapClient.class.getName());

	public void sendPDFToAgency(String cdata, String encodedPDFString, FunctionInput message, FunctionOutput issueStatementResponse) {
		PDFTarget target = PDFTarget.fromValue(message.getPdfTarget());
		Holder<Integer> certificateProvisionResult = new Holder<>();
		Provisioning110 provisioning110 = null;
		switch (target) {
			case LANDATA:
				ProvisioningLanData provisioningLanData = new ProvisioningLanData();
				provisioning110 = provisioningLanData.getProvisioning110();
				break;
			case SAI_GLOBAL:
				ProvisioningSAI provisioningSAI = new ProvisioningSAI();
				provisioning110 = provisioningSAI.getProvisioning110();
				break;
			default:
		}
		if (provisioning110 != null) {
			Holder<ArrayOfString> exception =
					new Holder<>();
			provisioning110.certificateProvision(cdata, encodedPDFString, certificateProvisionResult, exception);
			log.info("Status {}", certificateProvisionResult.value);
		}
		issueStatementResponse
				.setResponseOK(certificateProvisionResult.value != null && certificateProvisionResult.value == 0);
	}

}
