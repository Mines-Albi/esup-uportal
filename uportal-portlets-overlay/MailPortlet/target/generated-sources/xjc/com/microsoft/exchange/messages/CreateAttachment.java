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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.exchange.types.ItemIdType;
import com.microsoft.exchange.types.NonEmptyArrayOfAttachmentsType;
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
 * <p>Java class for CreateAttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateAttachmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ParentItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/>
 *         &lt;element name="Attachments" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfAttachmentsType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateAttachmentType", propOrder = {
    "parentItemId",
    "attachments"
})
@XmlRootElement(name = "CreateAttachment")
public class CreateAttachment
    extends BaseRequestType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "ParentItemId", required = true)
    protected ItemIdType parentItemId;
    @XmlElement(name = "Attachments", required = true)
    protected NonEmptyArrayOfAttachmentsType attachments;

    /**
     * Gets the value of the parentItemId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getParentItemId() {
        return parentItemId;
    }

    /**
     * Sets the value of the parentItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setParentItemId(ItemIdType value) {
        this.parentItemId = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfAttachmentsType }
     *     
     */
    public NonEmptyArrayOfAttachmentsType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfAttachmentsType }
     *     
     */
    public void setAttachments(NonEmptyArrayOfAttachmentsType value) {
        this.attachments = value;
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
            ItemIdType theParentItemId;
            theParentItemId = this.getParentItemId();
            strategy.appendField(locator, this, "parentItemId", buffer, theParentItemId);
        }
        {
            NonEmptyArrayOfAttachmentsType theAttachments;
            theAttachments = this.getAttachments();
            strategy.appendField(locator, this, "attachments", buffer, theAttachments);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CreateAttachment)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CreateAttachment that = ((CreateAttachment) object);
        {
            ItemIdType lhsParentItemId;
            lhsParentItemId = this.getParentItemId();
            ItemIdType rhsParentItemId;
            rhsParentItemId = that.getParentItemId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parentItemId", lhsParentItemId), LocatorUtils.property(thatLocator, "parentItemId", rhsParentItemId), lhsParentItemId, rhsParentItemId)) {
                return false;
            }
        }
        {
            NonEmptyArrayOfAttachmentsType lhsAttachments;
            lhsAttachments = this.getAttachments();
            NonEmptyArrayOfAttachmentsType rhsAttachments;
            rhsAttachments = that.getAttachments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachments", lhsAttachments), LocatorUtils.property(thatLocator, "attachments", rhsAttachments), lhsAttachments, rhsAttachments)) {
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
            ItemIdType theParentItemId;
            theParentItemId = this.getParentItemId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parentItemId", theParentItemId), currentHashCode, theParentItemId);
        }
        {
            NonEmptyArrayOfAttachmentsType theAttachments;
            theAttachments = this.getAttachments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachments", theAttachments), currentHashCode, theAttachments);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
