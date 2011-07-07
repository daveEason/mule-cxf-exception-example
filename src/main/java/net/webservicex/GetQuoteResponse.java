package net.webservicex;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 6/20/11
 * Time: 3:18 PM
 * GetQuoteResponse
 */

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="GetQuoteResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getQuoteResult"
})
@XmlRootElement(name = "GetQuoteResponse", namespace = "http://www.webserviceX.NET/")
public class GetQuoteResponse {

    @XmlElement(name = "GetQuoteResult", namespace = "http://www.webserviceX.NET/")
    protected String getQuoteResult;

    /**
     * Gets the value of the getQuoteResult property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGetQuoteResult() {
        return getQuoteResult;
    }

    /**
     * Sets the value of the getQuoteResult property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGetQuoteResult(String value) {
        this.getQuoteResult = value;
    }

}

