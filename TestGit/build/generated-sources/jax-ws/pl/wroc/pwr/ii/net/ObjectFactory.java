
package pl.wroc.pwr.ii.net;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.wroc.pwr.ii.net package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.wroc.pwr.ii.net
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WitajResponse }
     * 
     */
    public WitajResponse createWitajResponse() {
        return new WitajResponse();
    }

    /**
     * Create an instance of {@link WitajTerazResponse }
     * 
     */
    public WitajTerazResponse createWitajTerazResponse() {
        return new WitajTerazResponse();
    }

    /**
     * Create an instance of {@link WitajTeraz }
     * 
     */
    public WitajTeraz createWitajTeraz() {
        return new WitajTeraz();
    }

    /**
     * Create an instance of {@link Witaj }
     * 
     */
    public Witaj createWitaj() {
        return new Witaj();
    }

}
