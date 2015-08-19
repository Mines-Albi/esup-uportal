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
import com.microsoft.exchange.types.SyncFolderItemsChangesType;
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
 * <p>Java class for SyncFolderItemsResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncFolderItemsResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="SyncState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludesLastItemInRange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Changes" type="{http://schemas.microsoft.com/exchange/services/2006/types}SyncFolderItemsChangesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncFolderItemsResponseMessageType", propOrder = {
    "syncState",
    "includesLastItemInRange",
    "changes"
})
public class SyncFolderItemsResponseMessageType
    extends ResponseMessageType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "SyncState")
    protected String syncState;
    @XmlElement(name = "IncludesLastItemInRange")
    protected Boolean includesLastItemInRange;
    @XmlElement(name = "Changes")
    protected SyncFolderItemsChangesType changes;

    /**
     * Gets the value of the syncState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncState() {
        return syncState;
    }

    /**
     * Sets the value of the syncState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncState(String value) {
        this.syncState = value;
    }

    /**
     * Gets the value of the includesLastItemInRange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludesLastItemInRange() {
        return includesLastItemInRange;
    }

    /**
     * Sets the value of the includesLastItemInRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludesLastItemInRange(Boolean value) {
        this.includesLastItemInRange = value;
    }

    /**
     * Gets the value of the changes property.
     * 
     * @return
     *     possible object is
     *     {@link SyncFolderItemsChangesType }
     *     
     */
    public SyncFolderItemsChangesType getChanges() {
        return changes;
    }

    /**
     * Sets the value of the changes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncFolderItemsChangesType }
     *     
     */
    public void setChanges(SyncFolderItemsChangesType value) {
        this.changes = value;
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
            String theSyncState;
            theSyncState = this.getSyncState();
            strategy.appendField(locator, this, "syncState", buffer, theSyncState);
        }
        {
            Boolean theIncludesLastItemInRange;
            theIncludesLastItemInRange = this.isIncludesLastItemInRange();
            strategy.appendField(locator, this, "includesLastItemInRange", buffer, theIncludesLastItemInRange);
        }
        {
            SyncFolderItemsChangesType theChanges;
            theChanges = this.getChanges();
            strategy.appendField(locator, this, "changes", buffer, theChanges);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SyncFolderItemsResponseMessageType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SyncFolderItemsResponseMessageType that = ((SyncFolderItemsResponseMessageType) object);
        {
            String lhsSyncState;
            lhsSyncState = this.getSyncState();
            String rhsSyncState;
            rhsSyncState = that.getSyncState();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "syncState", lhsSyncState), LocatorUtils.property(thatLocator, "syncState", rhsSyncState), lhsSyncState, rhsSyncState)) {
                return false;
            }
        }
        {
            Boolean lhsIncludesLastItemInRange;
            lhsIncludesLastItemInRange = this.isIncludesLastItemInRange();
            Boolean rhsIncludesLastItemInRange;
            rhsIncludesLastItemInRange = that.isIncludesLastItemInRange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includesLastItemInRange", lhsIncludesLastItemInRange), LocatorUtils.property(thatLocator, "includesLastItemInRange", rhsIncludesLastItemInRange), lhsIncludesLastItemInRange, rhsIncludesLastItemInRange)) {
                return false;
            }
        }
        {
            SyncFolderItemsChangesType lhsChanges;
            lhsChanges = this.getChanges();
            SyncFolderItemsChangesType rhsChanges;
            rhsChanges = that.getChanges();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changes", lhsChanges), LocatorUtils.property(thatLocator, "changes", rhsChanges), lhsChanges, rhsChanges)) {
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
            String theSyncState;
            theSyncState = this.getSyncState();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "syncState", theSyncState), currentHashCode, theSyncState);
        }
        {
            Boolean theIncludesLastItemInRange;
            theIncludesLastItemInRange = this.isIncludesLastItemInRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includesLastItemInRange", theIncludesLastItemInRange), currentHashCode, theIncludesLastItemInRange);
        }
        {
            SyncFolderItemsChangesType theChanges;
            theChanges = this.getChanges();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changes", theChanges), currentHashCode, theChanges);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
