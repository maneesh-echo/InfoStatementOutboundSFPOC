
package au.gov.vic.landata.portal1.agencywebservices._1_10.provisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="custodianCertificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custodianAttachment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "custodianCertificate",
    "custodianAttachment"
})
@XmlRootElement(name = "CertificateProvision")
public class CertificateProvision {

    protected String custodianCertificate;
    protected String custodianAttachment;

    /**
     * Gets the value of the custodianCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustodianCertificate() {
        return custodianCertificate;
    }

    /**
     * Sets the value of the custodianCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustodianCertificate(String value) {
        this.custodianCertificate = value;
    }

    /**
     * Gets the value of the custodianAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustodianAttachment() {
        return custodianAttachment;
    }

    /**
     * Sets the value of the custodianAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustodianAttachment(String value) {
        this.custodianAttachment = value;
    }

}
