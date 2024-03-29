
package au.gov.vic.landata.portal1.agencywebservices._1_10.provisioning;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.gov.vic.landata.portal1.agencywebservices._1_10.provisioning package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.gov.vic.landata.portal1.agencywebservices._1_10.provisioning
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CertificateProvision }
     * 
     */
    public CertificateProvision createCertificateProvision() {
        return new CertificateProvision();
    }

    /**
     * Create an instance of {@link CertificateProvisionResponse }
     * 
     */
    public CertificateProvisionResponse createCertificateProvisionResponse() {
        return new CertificateProvisionResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link CertificateStatusPush }
     * 
     */
    public CertificateStatusPush createCertificateStatusPush() {
        return new CertificateStatusPush();
    }

    /**
     * Create an instance of {@link CertificateStatusPushResponse }
     * 
     */
    public CertificateStatusPushResponse createCertificateStatusPushResponse() {
        return new CertificateStatusPushResponse();
    }

}
