
package webservicesclients;

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
@WebService(name = "MyFirstWebService", targetNamespace = "http://webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MyFirstWebService {


    /**
     * 
     * @param i
     * @param j
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://webservices/", className = "webservicesclients.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://webservices/", className = "webservicesclients.AddResponse")
    @Action(input = "http://webservices/MyFirstWebService/addRequest", output = "http://webservices/MyFirstWebService/addResponse")
    public int add(
        @WebParam(name = "i", targetNamespace = "")
        int i,
        @WebParam(name = "j", targetNamespace = "")
        int j);

}
