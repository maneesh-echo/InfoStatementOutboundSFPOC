package au.gov.vic.landata.portal1.agencywebservices._1_10.provisioning;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2021-08-15T12:28:54.093+05:30
 * Generated source version: 3.3.2
 *
 */
@WebServiceClient(name = "ProvisioningSAI",
                  wsdlLocation = "classpath:Provisioning_SAI.wsdl",
                  targetNamespace = "http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning")
public class ProvisioningSAI extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning", "ProvisioningSAI");
    public final static QName Provisioning110 = new QName("http://Portal1.landata.vic.gov.au/AgencyWebServices/1.10/Provisioning", "Provisioning_1.10");
    static {
        URL url = ProvisioningSAI.class.getClassLoader().getResource("Provisioning_SAI.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(ProvisioningSAI.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:Provisioning_SAI.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ProvisioningSAI(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ProvisioningSAI(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProvisioningSAI() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ProvisioningSAI(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ProvisioningSAI(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ProvisioningSAI(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Provisioning110
     */
    @WebEndpoint(name = "Provisioning_1.10")
    public Provisioning110 getProvisioning110() {
        return super.getPort(Provisioning110, Provisioning110.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Provisioning110
     */
    @WebEndpoint(name = "Provisioning_1.10")
    public Provisioning110 getProvisioning110(WebServiceFeature... features) {
        return super.getPort(Provisioning110, Provisioning110.class, features);
    }

}
