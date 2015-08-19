//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.18 at 02:30:12 PM CEST 
//


package com.microsoft.exchange.autodiscover;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for TokenIssuer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenIssuer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Endpoint" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenIssuer", propOrder = {
    "uri",
    "endpoint"
})
public class TokenIssuer
    implements Equals, HashCode, ToString
{

    @XmlElementRef(name = "Uri", namespace = "http://schemas.microsoft.com/exchange/2010/Autodiscover", type = JAXBElement.class)
    protected JAXBElement<String> uri;
    @XmlElementRef(name = "Endpoint", namespace = "http://schemas.microsoft.com/exchange/2010/Autodiscover", type = JAXBElement.class)
    protected JAXBElement<String> endpoint;

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUri(JAXBElement<String> value) {
        this.uri = value;
    }

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndpoint(JAXBElement<String> value) {
        this.endpoint = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            JAXBElement<String> theUri;
            theUri = this.getUri();
            strategy.appendField(locator, this, "uri", buffer, theUri);
        }
        {
            JAXBElement<String> theEndpoint;
            theEndpoint = this.getEndpoint();
            strategy.appendField(locator, this, "endpoint", buffer, theEndpoint);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TokenIssuer)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TokenIssuer that = ((TokenIssuer) object);
        {
            JAXBElement<String> lhsUri;
            lhsUri = this.getUri();
            JAXBElement<String> rhsUri;
            rhsUri = that.getUri();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uri", lhsUri), LocatorUtils.property(thatLocator, "uri", rhsUri), lhsUri, rhsUri)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsEndpoint;
            lhsEndpoint = this.getEndpoint();
            JAXBElement<String> rhsEndpoint;
            rhsEndpoint = that.getEndpoint();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endpoint", lhsEndpoint), LocatorUtils.property(thatLocator, "endpoint", rhsEndpoint), lhsEndpoint, rhsEndpoint)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            JAXBElement<String> theUri;
            theUri = this.getUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uri", theUri), currentHashCode, theUri);
        }
        {
            JAXBElement<String> theEndpoint;
            theEndpoint = this.getEndpoint();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endpoint", theEndpoint), currentHashCode, theEndpoint);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
