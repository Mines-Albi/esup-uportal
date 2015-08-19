//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.18 at 02:30:12 PM CEST 
//


package com.microsoft.exchange.types;

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
 * <p>Java class for NotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}SearchExpressionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.microsoft.com/exchange/services/2006/types}SearchExpression"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotType", propOrder = {
    "searchExpression"
})
public class NotType
    extends SearchExpressionType
    implements Equals, HashCode, ToString
{

    @XmlElementRef(name = "SearchExpression", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class)
    protected JAXBElement<? extends SearchExpressionType> searchExpression;

    /**
     * Gets the value of the searchExpression property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IsGreaterThanOrEqualToType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExistsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SearchExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AndType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsLessThanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsNotEqualToType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContainsExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NotType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsGreaterThanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcludesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsLessThanOrEqualToType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsEqualToType }{@code >}
     *     
     */
    public JAXBElement<? extends SearchExpressionType> getSearchExpression() {
        return searchExpression;
    }

    /**
     * Sets the value of the searchExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IsGreaterThanOrEqualToType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExistsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SearchExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AndType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsLessThanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsNotEqualToType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContainsExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NotType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsGreaterThanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcludesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsLessThanOrEqualToType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsEqualToType }{@code >}
     *     
     */
    public void setSearchExpression(JAXBElement<? extends SearchExpressionType> value) {
        this.searchExpression = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            JAXBElement<? extends SearchExpressionType> theSearchExpression;
            theSearchExpression = this.getSearchExpression();
            strategy.appendField(locator, this, "searchExpression", buffer, theSearchExpression);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NotType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final NotType that = ((NotType) object);
        {
            JAXBElement<? extends SearchExpressionType> lhsSearchExpression;
            lhsSearchExpression = this.getSearchExpression();
            JAXBElement<? extends SearchExpressionType> rhsSearchExpression;
            rhsSearchExpression = that.getSearchExpression();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchExpression", lhsSearchExpression), LocatorUtils.property(thatLocator, "searchExpression", rhsSearchExpression), lhsSearchExpression, rhsSearchExpression)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            JAXBElement<? extends SearchExpressionType> theSearchExpression;
            theSearchExpression = this.getSearchExpression();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchExpression", theSearchExpression), currentHashCode, theSearchExpression);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
