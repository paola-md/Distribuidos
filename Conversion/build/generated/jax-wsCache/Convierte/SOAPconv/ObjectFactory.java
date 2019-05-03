
package SOAPconv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the SOAPconv package. 
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

    private final static QName _DolarPeso_QNAME = new QName("http://serv/", "dolarPeso");
    private final static QName _DolarPesoResponse_QNAME = new QName("http://serv/", "dolarPesoResponse");
    private final static QName _Hello_QNAME = new QName("http://serv/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://serv/", "helloResponse");
    private final static QName _PesoDolar_QNAME = new QName("http://serv/", "pesoDolar");
    private final static QName _PesoDolarResponse_QNAME = new QName("http://serv/", "pesoDolarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: SOAPconv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DolarPeso }
     * 
     */
    public DolarPeso createDolarPeso() {
        return new DolarPeso();
    }

    /**
     * Create an instance of {@link DolarPesoResponse }
     * 
     */
    public DolarPesoResponse createDolarPesoResponse() {
        return new DolarPesoResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link PesoDolar }
     * 
     */
    public PesoDolar createPesoDolar() {
        return new PesoDolar();
    }

    /**
     * Create an instance of {@link PesoDolarResponse }
     * 
     */
    public PesoDolarResponse createPesoDolarResponse() {
        return new PesoDolarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DolarPeso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serv/", name = "dolarPeso")
    public JAXBElement<DolarPeso> createDolarPeso(DolarPeso value) {
        return new JAXBElement<DolarPeso>(_DolarPeso_QNAME, DolarPeso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DolarPesoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serv/", name = "dolarPesoResponse")
    public JAXBElement<DolarPesoResponse> createDolarPesoResponse(DolarPesoResponse value) {
        return new JAXBElement<DolarPesoResponse>(_DolarPesoResponse_QNAME, DolarPesoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serv/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serv/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesoDolar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serv/", name = "pesoDolar")
    public JAXBElement<PesoDolar> createPesoDolar(PesoDolar value) {
        return new JAXBElement<PesoDolar>(_PesoDolar_QNAME, PesoDolar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesoDolarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serv/", name = "pesoDolarResponse")
    public JAXBElement<PesoDolarResponse> createPesoDolarResponse(PesoDolarResponse value) {
        return new JAXBElement<PesoDolarResponse>(_PesoDolarResponse_QNAME, PesoDolarResponse.class, null, value);
    }

}
