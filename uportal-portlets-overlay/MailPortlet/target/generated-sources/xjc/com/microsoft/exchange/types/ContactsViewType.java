//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.18 at 02:30:12 PM CEST 
//


package com.microsoft.exchange.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for ContactsViewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactsViewType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BasePagingType">
 *       &lt;attribute name="InitialName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FinalName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactsViewType")
public class ContactsViewType
    extends BasePagingType
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "InitialName")
    protected String initialName;
    @XmlAttribute(name = "FinalName")
    protected String finalName;

    /**
     * Gets the value of the initialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialName() {
        return initialName;
    }

    /**
     * Sets the value of the initialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialName(String value) {
        this.initialName = value;
    }

    /**
     * Gets the value of the finalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalName() {
        return finalName;
    }

    /**
     * Sets the value of the finalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalName(String value) {
        this.finalName = value;
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
            String theInitialName;
            theInitialName = this.getInitialName();
            strategy.appendField(locator, this, "initialName", buffer, theInitialName);
        }
        {
            String theFinalName;
            theFinalName = this.getFinalName();
            strategy.appendField(locator, this, "finalName", buffer, theFinalName);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ContactsViewType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ContactsViewType that = ((ContactsViewType) object);
        {
            String lhsInitialName;
            lhsInitialName = this.getInitialName();
            String rhsInitialName;
            rhsInitialName = that.getInitialName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "initialName", lhsInitialName), LocatorUtils.property(thatLocator, "initialName", rhsInitialName), lhsInitialName, rhsInitialName)) {
                return false;
            }
        }
        {
            String lhsFinalName;
            lhsFinalName = this.getFinalName();
            String rhsFinalName;
            rhsFinalName = that.getFinalName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finalName", lhsFinalName), LocatorUtils.property(thatLocator, "finalName", rhsFinalName), lhsFinalName, rhsFinalName)) {
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
            String theInitialName;
            theInitialName = this.getInitialName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "initialName", theInitialName), currentHashCode, theInitialName);
        }
        {
            String theFinalName;
            theFinalName = this.getFinalName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finalName", theFinalName), currentHashCode, theFinalName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
