
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
 *         &lt;element name="custodianResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "custodianResponse"
})
@XmlRootElement(name = "CertificateStatusPush")
public class CertificateStatusPush {

    protected String custodianResponse;

    /**
     * Gets the value of the custodianResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustodianResponse() {
        return custodianResponse;
    }

    /**
     * Sets the value of the custodianResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustodianResponse(String value) {
        this.custodianResponse = value;
    }

}
