package au.gov.vic.landata.portal1.agencywebservices._1_10.provisioning;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2021-08-15T12:28:54.086+05:30
 * Generated source version: 3.3.2
 *
 */
@WebService(targetNamespace = "http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning", name = "Provisioning_1.10")
@XmlSeeAlso({ObjectFactory.class})
public interface Provisioning110 {

    @WebMethod(operationName = "CertificateProvision", action = "http://Portal1.landata.vic.gov.au/AgencyWebservices/1.10/CertificateProvision")
    @RequestWrapper(localName = "CertificateProvision", targetNamespace = "http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning", className = "au.gov.vic.landata.portal1.agencywebservices._1_10.provisioning.CertificateProvision")
    @ResponseWrapper(localName = "CertificateProvisionResponse", targetNamespace = "http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning", className = "au.gov.vic.landata.portal1.agencywebservices._1_10.provisioning.CertificateProvisionResponse")
    public void certificateProvision(

        @WebParam(name = "custodianCertificate", targetNamespace = "http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning")
        java.lang.String custodianCertificate,
        @WebParam(name = "custodianAttachment", targetNamespace = "http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning")
        java.lang.String custodianAttachment,
        @WebParam(mode = WebParam.Mode.OUT, name = "CertificateProvisionResult", targetNamespace = "http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning")
        javax.xml.ws.Holder<java.lang.Integer> certificateProvisionResult,
        @WebParam(mode = WebParam.Mode.OUT, name = "exception", targetNamespace = "http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning")
        javax.xml.ws.Holder<ArrayOfString> exception
    );

    @WebMethod(operationName = "CertificateStatusPush", action = "http://Portal1.landata.vic.gov.au/AgencyWebservices/1.10/CertificateStatusPush")
    @RequestWrapper(localName = "CertificateStatusPush", targetNamespace = "http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning", className = "au.gov.vic.landata.portal1.agencywebservices._1_10.provisioning.CertificateStatusPush")
    @ResponseWrapper(localName = "CertificateStatusPushResponse", targetNamespace = "http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning", className = "au.gov.vic.landata.portal1.agencywebservices._1_10.provisioning.CertificateStatusPushResponse")
    public void certificateStatusPush(

        @WebParam(name = "custodianResponse", targetNamespace = "http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning")
        java.lang.String custodianResponse,
        @WebParam(mode = WebParam.Mode.OUT, name = "CertificateStatusPushResult", targetNamespace = "http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning")
        javax.xml.ws.Holder<java.lang.Integer> certificateStatusPushResult,
        @WebParam(mode = WebParam.Mode.OUT, name = "exception", targetNamespace = "http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning")
        javax.xml.ws.Holder<ArrayOfString> exception
    );
}
