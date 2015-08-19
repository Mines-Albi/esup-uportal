//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.18 at 02:30:12 PM CEST 
//


package com.microsoft.exchange.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.exchange.types.ArrayOfSuggestionDayResult;
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
 * <p>Java class for SuggestionsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuggestionsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType" minOccurs="0"/>
 *         &lt;element name="SuggestionDayResultArray" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSuggestionDayResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestionsResponseType", propOrder = {
    "responseMessage",
    "suggestionDayResultArray"
})
public class SuggestionsResponseType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "ResponseMessage")
    protected ResponseMessageType responseMessage;
    @XmlElement(name = "SuggestionDayResultArray")
    protected ArrayOfSuggestionDayResult suggestionDayResultArray;

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMessageType }
     *     
     */
    public ResponseMessageType getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMessageType }
     *     
     */
    public void setResponseMessage(ResponseMessageType value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the suggestionDayResultArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSuggestionDayResult }
     *     
     */
    public ArrayOfSuggestionDayResult getSuggestionDayResultArray() {
        return suggestionDayResultArray;
    }

    /**
     * Sets the value of the suggestionDayResultArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSuggestionDayResult }
     *     
     */
    public void setSuggestionDayResultArray(ArrayOfSuggestionDayResult value) {
        this.suggestionDayResultArray = value;
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
            ResponseMessageType theResponseMessage;
            theResponseMessage = this.getResponseMessage();
            strategy.appendField(locator, this, "responseMessage", buffer, theResponseMessage);
        }
        {
            ArrayOfSuggestionDayResult theSuggestionDayResultArray;
            theSuggestionDayResultArray = this.getSuggestionDayResultArray();
            strategy.appendField(locator, this, "suggestionDayResultArray", buffer, theSuggestionDayResultArray);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SuggestionsResponseType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SuggestionsResponseType that = ((SuggestionsResponseType) object);
        {
            ResponseMessageType lhsResponseMessage;
            lhsResponseMessage = this.getResponseMessage();
            ResponseMessageType rhsResponseMessage;
            rhsResponseMessage = that.getResponseMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseMessage", lhsResponseMessage), LocatorUtils.property(thatLocator, "responseMessage", rhsResponseMessage), lhsResponseMessage, rhsResponseMessage)) {
                return false;
            }
        }
        {
            ArrayOfSuggestionDayResult lhsSuggestionDayResultArray;
            lhsSuggestionDayResultArray = this.getSuggestionDayResultArray();
            ArrayOfSuggestionDayResult rhsSuggestionDayResultArray;
            rhsSuggestionDayResultArray = that.getSuggestionDayResultArray();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suggestionDayResultArray", lhsSuggestionDayResultArray), LocatorUtils.property(thatLocator, "suggestionDayResultArray", rhsSuggestionDayResultArray), lhsSuggestionDayResultArray, rhsSuggestionDayResultArray)) {
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
            ResponseMessageType theResponseMessage;
            theResponseMessage = this.getResponseMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseMessage", theResponseMessage), currentHashCode, theResponseMessage);
        }
        {
            ArrayOfSuggestionDayResult theSuggestionDayResultArray;
            theSuggestionDayResultArray = this.getSuggestionDayResultArray();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "suggestionDayResultArray", theSuggestionDayResultArray), currentHashCode, theSuggestionDayResultArray);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
