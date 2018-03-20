
package org.me.filestatistic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.filestatistic package. 
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

    private final static QName _GetLetterCount_QNAME = new QName("http://fileStatistic.me.org/", "getLetterCount");
    private final static QName _GetWordCountResponse_QNAME = new QName("http://fileStatistic.me.org/", "getWordCountResponse");
    private final static QName _GetLetterCountResponse_QNAME = new QName("http://fileStatistic.me.org/", "getLetterCountResponse");
    private final static QName _GetLineCount_QNAME = new QName("http://fileStatistic.me.org/", "getLineCount");
    private final static QName _GetLineCountResponse_QNAME = new QName("http://fileStatistic.me.org/", "getLineCountResponse");
    private final static QName _GetWordCount_QNAME = new QName("http://fileStatistic.me.org/", "getWordCount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.filestatistic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWordCount }
     * 
     */
    public GetWordCount createGetWordCount() {
        return new GetWordCount();
    }

    /**
     * Create an instance of {@link GetLineCountResponse }
     * 
     */
    public GetLineCountResponse createGetLineCountResponse() {
        return new GetLineCountResponse();
    }

    /**
     * Create an instance of {@link GetLineCount }
     * 
     */
    public GetLineCount createGetLineCount() {
        return new GetLineCount();
    }

    /**
     * Create an instance of {@link GetLetterCountResponse }
     * 
     */
    public GetLetterCountResponse createGetLetterCountResponse() {
        return new GetLetterCountResponse();
    }

    /**
     * Create an instance of {@link GetLetterCount }
     * 
     */
    public GetLetterCount createGetLetterCount() {
        return new GetLetterCount();
    }

    /**
     * Create an instance of {@link GetWordCountResponse }
     * 
     */
    public GetWordCountResponse createGetWordCountResponse() {
        return new GetWordCountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLetterCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fileStatistic.me.org/", name = "getLetterCount")
    public JAXBElement<GetLetterCount> createGetLetterCount(GetLetterCount value) {
        return new JAXBElement<GetLetterCount>(_GetLetterCount_QNAME, GetLetterCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWordCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fileStatistic.me.org/", name = "getWordCountResponse")
    public JAXBElement<GetWordCountResponse> createGetWordCountResponse(GetWordCountResponse value) {
        return new JAXBElement<GetWordCountResponse>(_GetWordCountResponse_QNAME, GetWordCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLetterCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fileStatistic.me.org/", name = "getLetterCountResponse")
    public JAXBElement<GetLetterCountResponse> createGetLetterCountResponse(GetLetterCountResponse value) {
        return new JAXBElement<GetLetterCountResponse>(_GetLetterCountResponse_QNAME, GetLetterCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLineCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fileStatistic.me.org/", name = "getLineCount")
    public JAXBElement<GetLineCount> createGetLineCount(GetLineCount value) {
        return new JAXBElement<GetLineCount>(_GetLineCount_QNAME, GetLineCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLineCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fileStatistic.me.org/", name = "getLineCountResponse")
    public JAXBElement<GetLineCountResponse> createGetLineCountResponse(GetLineCountResponse value) {
        return new JAXBElement<GetLineCountResponse>(_GetLineCountResponse_QNAME, GetLineCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWordCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fileStatistic.me.org/", name = "getWordCount")
    public JAXBElement<GetWordCount> createGetWordCount(GetWordCount value) {
        return new JAXBElement<GetWordCount>(_GetWordCount_QNAME, GetWordCount.class, null, value);
    }

}
