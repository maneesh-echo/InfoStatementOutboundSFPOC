
package au.gov.vic.landata.portal1.agencywebservices._1_10.provisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificateStatusPushResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="exception" type="{http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "certificateStatusPushResult",
    "exception"
})
@XmlRootElement(name = "CertificateStatusPushResponse")
public class CertificateStatusPushResponse {

    @XmlElement(name = "CertificateStatusPushResult")
    protected int certificateStatusPushResult;
    protected ArrayOfString exception;

    /**
     * Gets the value of the certificateStatusPushResult property.
     * 
     */
    public int getCertificateStatusPushResult() {
        return certificateStatusPushResult;
    }

    /**
     * Sets the value of the certificateStatusPushResult property.
     * 
     */
    public void setCertificateStatusPushResult(int value) {
        this.certificateStatusPushResult = value;
    }

    /**
     * Gets the value of the exception property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getException() {
        return exception;
    }

    /**
     * Sets the value of the exception property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setException(ArrayOfString value) {
        this.exception = value;
    }

}
