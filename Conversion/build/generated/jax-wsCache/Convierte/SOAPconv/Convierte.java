
package SOAPconv;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Convierte", targetNamespace = "http://serv/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Convierte {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://serv/", className = "SOAPconv.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://serv/", className = "SOAPconv.HelloResponse")
    @Action(input = "http://serv/Convierte/helloRequest", output = "http://serv/Convierte/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param dolar
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dolarPeso", targetNamespace = "http://serv/", className = "SOAPconv.DolarPeso")
    @ResponseWrapper(localName = "dolarPesoResponse", targetNamespace = "http://serv/", className = "SOAPconv.DolarPesoResponse")
    @Action(input = "http://serv/Convierte/dolarPesoRequest", output = "http://serv/Convierte/dolarPesoResponse")
    public double dolarPeso(
        @WebParam(name = "dolar", targetNamespace = "")
        double dolar);

}
