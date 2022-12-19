
package com.sltc.soa.client.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sltc.soa.client.stub package. 
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

    private final static QName _AdditionResponse_QNAME = new QName("http://soa.sltc.com/", "additionResponse");
    private final static QName _SubstractionResponse_QNAME = new QName("http://soa.sltc.com/", "substractionResponse");
    private final static QName _Addition_QNAME = new QName("http://soa.sltc.com/", "addition");
    private final static QName _Substraction_QNAME = new QName("http://soa.sltc.com/", "substraction");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sltc.soa.client.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubstractionResponse }
     * 
     */
    public SubstractionResponse createSubstractionResponse() {
        return new SubstractionResponse();
    }

    /**
     * Create an instance of {@link AdditionResponse }
     * 
     */
    public AdditionResponse createAdditionResponse() {
        return new AdditionResponse();
    }

    /**
     * Create an instance of {@link Substraction }
     * 
     */
    public Substraction createSubstraction() {
        return new Substraction();
    }

    /**
     * Create an instance of {@link Addition }
     * 
     */
    public Addition createAddition() {
        return new Addition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "additionResponse")
    public JAXBElement<AdditionResponse> createAdditionResponse(AdditionResponse value) {
        return new JAXBElement<AdditionResponse>(_AdditionResponse_QNAME, AdditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstractionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "substractionResponse")
    public JAXBElement<SubstractionResponse> createSubstractionResponse(SubstractionResponse value) {
        return new JAXBElement<SubstractionResponse>(_SubstractionResponse_QNAME, SubstractionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "addition")
    public JAXBElement<Addition> createAddition(Addition value) {
        return new JAXBElement<Addition>(_Addition_QNAME, Addition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Substraction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "substraction")
    public JAXBElement<Substraction> createSubstraction(Substraction value) {
        return new JAXBElement<Substraction>(_Substraction_QNAME, Substraction.class, null, value);
    }

}
