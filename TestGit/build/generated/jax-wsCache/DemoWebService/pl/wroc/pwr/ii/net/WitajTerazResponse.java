
package pl.wroc.pwr.ii.net;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="witajTerazResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "witajTerazResult"
})
@XmlRootElement(name = "witajTerazResponse")
public class WitajTerazResponse {

    protected String witajTerazResult;

    /**
     * Gets the value of the witajTerazResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitajTerazResult() {
        return witajTerazResult;
    }

    /**
     * Sets the value of the witajTerazResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitajTerazResult(String value) {
        this.witajTerazResult = value;
    }

}
