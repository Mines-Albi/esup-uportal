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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.exchange.types.NonEmptyArrayOfBaseItemIdsType;
import com.microsoft.exchange.types.TargetFolderIdType;
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
 * <p>Java class for BaseMoveCopyItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseMoveCopyItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ToFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType"/>
 *         &lt;element name="ItemIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseItemIdsType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseMoveCopyItemType", propOrder = {
    "toFolderId",
    "itemIds"
})
@XmlSeeAlso({
    MoveItem.class,
    CopyItem.class
})
public class BaseMoveCopyItemType
    extends BaseRequestType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "ToFolderId", required = true)
    protected TargetFolderIdType toFolderId;
    @XmlElement(name = "ItemIds", required = true)
    protected NonEmptyArrayOfBaseItemIdsType itemIds;

    /**
     * Gets the value of the toFolderId property.
     * 
     * @return
     *     possible object is
     *     {@link TargetFolderIdType }
     *     
     */
    public TargetFolderIdType getToFolderId() {
        return toFolderId;
    }

    /**
     * Sets the value of the toFolderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetFolderIdType }
     *     
     */
    public void setToFolderId(TargetFolderIdType value) {
        this.toFolderId = value;
    }

    /**
     * Gets the value of the itemIds property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public NonEmptyArrayOfBaseItemIdsType getItemIds() {
        return itemIds;
    }

    /**
     * Sets the value of the itemIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public void setItemIds(NonEmptyArrayOfBaseItemIdsType value) {
        this.itemIds = value;
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
            TargetFolderIdType theToFolderId;
            theToFolderId = this.getToFolderId();
            strategy.appendField(locator, this, "toFolderId", buffer, theToFolderId);
        }
        {
            NonEmptyArrayOfBaseItemIdsType theItemIds;
            theItemIds = this.getItemIds();
            strategy.appendField(locator, this, "itemIds", buffer, theItemIds);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BaseMoveCopyItemType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final BaseMoveCopyItemType that = ((BaseMoveCopyItemType) object);
        {
            TargetFolderIdType lhsToFolderId;
            lhsToFolderId = this.getToFolderId();
            TargetFolderIdType rhsToFolderId;
            rhsToFolderId = that.getToFolderId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "toFolderId", lhsToFolderId), LocatorUtils.property(thatLocator, "toFolderId", rhsToFolderId), lhsToFolderId, rhsToFolderId)) {
                return false;
            }
        }
        {
            NonEmptyArrayOfBaseItemIdsType lhsItemIds;
            lhsItemIds = this.getItemIds();
            NonEmptyArrayOfBaseItemIdsType rhsItemIds;
            rhsItemIds = that.getItemIds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemIds", lhsItemIds), LocatorUtils.property(thatLocator, "itemIds", rhsItemIds), lhsItemIds, rhsItemIds)) {
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
            TargetFolderIdType theToFolderId;
            theToFolderId = this.getToFolderId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "toFolderId", theToFolderId), currentHashCode, theToFolderId);
        }
        {
            NonEmptyArrayOfBaseItemIdsType theItemIds;
            theItemIds = this.getItemIds();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemIds", theItemIds), currentHashCode, theItemIds);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
