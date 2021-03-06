
package nuevosCambio;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Convierte", targetNamespace = "http://serv/", wsdlLocation = "http://localhost:8080/Convierte/Convierte?WSDL")
public class Convierte_Service
    extends Service
{

    private final static URL CONVIERTE_WSDL_LOCATION;
    private final static WebServiceException CONVIERTE_EXCEPTION;
    private final static QName CONVIERTE_QNAME = new QName("http://serv/", "Convierte");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Convierte/Convierte?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONVIERTE_WSDL_LOCATION = url;
        CONVIERTE_EXCEPTION = e;
    }

    public Convierte_Service() {
        super(__getWsdlLocation(), CONVIERTE_QNAME);
    }

    public Convierte_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONVIERTE_QNAME, features);
    }

    public Convierte_Service(URL wsdlLocation) {
        super(wsdlLocation, CONVIERTE_QNAME);
    }

    public Convierte_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONVIERTE_QNAME, features);
    }

    public Convierte_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Convierte_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Convierte
     */
    @WebEndpoint(name = "ConviertePort")
    public Convierte getConviertePort() {
        return super.getPort(new QName("http://serv/", "ConviertePort"), Convierte.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Convierte
     */
    @WebEndpoint(name = "ConviertePort")
    public Convierte getConviertePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serv/", "ConviertePort"), Convierte.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONVIERTE_EXCEPTION!= null) {
            throw CONVIERTE_EXCEPTION;
        }
        return CONVIERTE_WSDL_LOCATION;
    }

}
