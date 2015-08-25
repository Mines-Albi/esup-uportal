//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.20 at 01:37:20 PM CEST 
//


package com.microsoft.exchange.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.exchange.types.FolderQueryTraversalType;
import com.microsoft.exchange.types.FolderResponseShapeType;
import com.microsoft.exchange.types.FractionalPageViewType;
import com.microsoft.exchange.types.IndexedPageViewType;
import com.microsoft.exchange.types.NonEmptyArrayOfBaseFolderIdsType;
import com.microsoft.exchange.types.RestrictionType;
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
 * <p>Java class for FindFolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindFolderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="FolderShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderResponseShapeType"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="IndexedPageFolderView" type="{http://schemas.microsoft.com/exchange/services/2006/types}IndexedPageViewType"/>
 *           &lt;element name="FractionalPageFolderView" type="{http://schemas.microsoft.com/exchange/services/2006/types}FractionalPageViewType"/>
 *         &lt;/choice>
 *         &lt;element name="Restriction" type="{http://schemas.microsoft.com/exchange/services/2006/types}RestrictionType" minOccurs="0"/>
 *         &lt;element name="ParentFolderIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseFolderIdsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Traversal" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderQueryTraversalType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindFolderType", propOrder = {
    "folderShape",
    "fractionalPageFolderView",
    "indexedPageFolderView",
    "restriction",
    "parentFolderIds"
})
@XmlRootElement(name = "FindFolder")
public class FindFolder
    extends BaseRequestType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "FolderShape", required = true)
    protected FolderResponseShapeType folderShape;
    @XmlElement(name = "FractionalPageFolderView")
    protected FractionalPageViewType fractionalPageFolderView;
    @XmlElement(name = "IndexedPageFolderView")
    protected IndexedPageViewType indexedPageFolderView;
    @XmlElement(name = "Restriction")
    protected RestrictionType restriction;
    @XmlElement(name = "ParentFolderIds", required = true)
    protected NonEmptyArrayOfBaseFolderIdsType parentFolderIds;
    @XmlAttribute(name = "Traversal", required = true)
    protected FolderQueryTraversalType traversal;

    /**
     * Gets the value of the folderShape property.
     * 
     * @return
     *     possible object is
     *     {@link FolderResponseShapeType }
     *     
     */
    public FolderResponseShapeType getFolderShape() {
        return folderShape;
    }

    /**
     * Sets the value of the folderShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderResponseShapeType }
     *     
     */
    public void setFolderShape(FolderResponseShapeType value) {
        this.folderShape = value;
    }

    /**
     * Gets the value of the fractionalPageFolderView property.
     * 
     * @return
     *     possible object is
     *     {@link FractionalPageViewType }
     *     
     */
    public FractionalPageViewType getFractionalPageFolderView() {
        return fractionalPageFolderView;
    }

    /**
     * Sets the value of the fractionalPageFolderView property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionalPageViewType }
     *     
     */
    public void setFractionalPageFolderView(FractionalPageViewType value) {
        this.fractionalPageFolderView = value;
    }

    /**
     * Gets the value of the indexedPageFolderView property.
     * 
     * @return
     *     possible object is
     *     {@link IndexedPageViewType }
     *     
     */
    public IndexedPageViewType getIndexedPageFolderView() {
        return indexedPageFolderView;
    }

    /**
     * Sets the value of the indexedPageFolderView property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexedPageViewType }
     *     
     */
    public void setIndexedPageFolderView(IndexedPageViewType value) {
        this.indexedPageFolderView = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionType }
     *     
     */
    public RestrictionType getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionType }
     *     
     */
    public void setRestriction(RestrictionType value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the parentFolderIds property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public NonEmptyArrayOfBaseFolderIdsType getParentFolderIds() {
        return parentFolderIds;
    }

    /**
     * Sets the value of the parentFolderIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public void setParentFolderIds(NonEmptyArrayOfBaseFolderIdsType value) {
        this.parentFolderIds = value;
    }

    /**
     * Gets the value of the traversal property.
     * 
     * @return
     *     possible object is
     *     {@link FolderQueryTraversalType }
     *     
     */
    public FolderQueryTraversalType getTraversal() {
        return traversal;
    }

    /**
     * Sets the value of the traversal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderQueryTraversalType }
     *     
     */
    public void setTraversal(FolderQueryTraversalType value) {
        this.traversal = value;
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
            FolderResponseShapeType theFolderShape;
            theFolderShape = this.getFolderShape();
            strategy.appendField(locator, this, "folderShape", buffer, theFolderShape);
        }
        {
            FractionalPageViewType theFractionalPageFolderView;
            theFractionalPageFolderView = this.getFractionalPageFolderView();
            strategy.appendField(locator, this, "fractionalPageFolderView", buffer, theFractionalPageFolderView);
        }
        {
            IndexedPageViewType theIndexedPageFolderView;
            theIndexedPageFolderView = this.getIndexedPageFolderView();
            strategy.appendField(locator, this, "indexedPageFolderView", buffer, theIndexedPageFolderView);
        }
        {
            RestrictionType theRestriction;
            theRestriction = this.getRestriction();
            strategy.appendField(locator, this, "restriction", buffer, theRestriction);
        }
        {
            NonEmptyArrayOfBaseFolderIdsType theParentFolderIds;
            theParentFolderIds = this.getParentFolderIds();
            strategy.appendField(locator, this, "parentFolderIds", buffer, theParentFolderIds);
        }
        {
            FolderQueryTraversalType theTraversal;
            theTraversal = this.getTraversal();
            strategy.appendField(locator, this, "traversal", buffer, theTraversal);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FindFolder)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FindFolder that = ((FindFolder) object);
        {
            FolderResponseShapeType lhsFolderShape;
            lhsFolderShape = this.getFolderShape();
            FolderResponseShapeType rhsFolderShape;
            rhsFolderShape = that.getFolderShape();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "folderShape", lhsFolderShape), LocatorUtils.property(thatLocator, "folderShape", rhsFolderShape), lhsFolderShape, rhsFolderShape)) {
                return false;
            }
        }
        {
            FractionalPageViewType lhsFractionalPageFolderView;
            lhsFractionalPageFolderView = this.getFractionalPageFolderView();
            FractionalPageViewType rhsFractionalPageFolderView;
            rhsFractionalPageFolderView = that.getFractionalPageFolderView();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fractionalPageFolderView", lhsFractionalPageFolderView), LocatorUtils.property(thatLocator, "fractionalPageFolderView", rhsFractionalPageFolderView), lhsFractionalPageFolderView, rhsFractionalPageFolderView)) {
                return false;
            }
        }
        {
            IndexedPageViewType lhsIndexedPageFolderView;
            lhsIndexedPageFolderView = this.getIndexedPageFolderView();
            IndexedPageViewType rhsIndexedPageFolderView;
            rhsIndexedPageFolderView = that.getIndexedPageFolderView();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexedPageFolderView", lhsIndexedPageFolderView), LocatorUtils.property(thatLocator, "indexedPageFolderView", rhsIndexedPageFolderView), lhsIndexedPageFolderView, rhsIndexedPageFolderView)) {
                return false;
            }
        }
        {
            RestrictionType lhsRestriction;
            lhsRestriction = this.getRestriction();
            RestrictionType rhsRestriction;
            rhsRestriction = that.getRestriction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "restriction", lhsRestriction), LocatorUtils.property(thatLocator, "restriction", rhsRestriction), lhsRestriction, rhsRestriction)) {
                return false;
            }
        }
        {
            NonEmptyArrayOfBaseFolderIdsType lhsParentFolderIds;
            lhsParentFolderIds = this.getParentFolderIds();
            NonEmptyArrayOfBaseFolderIdsType rhsParentFolderIds;
            rhsParentFolderIds = that.getParentFolderIds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parentFolderIds", lhsParentFolderIds), LocatorUtils.property(thatLocator, "parentFolderIds", rhsParentFolderIds), lhsParentFolderIds, rhsParentFolderIds)) {
                return false;
            }
        }
        {
            FolderQueryTraversalType lhsTraversal;
            lhsTraversal = this.getTraversal();
            FolderQueryTraversalType rhsTraversal;
            rhsTraversal = that.getTraversal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "traversal", lhsTraversal), LocatorUtils.property(thatLocator, "traversal", rhsTraversal), lhsTraversal, rhsTraversal)) {
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
            FolderResponseShapeType theFolderShape;
            theFolderShape = this.getFolderShape();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "folderShape", theFolderShape), currentHashCode, theFolderShape);
        }
        {
            FractionalPageViewType theFractionalPageFolderView;
            theFractionalPageFolderView = this.getFractionalPageFolderView();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fractionalPageFolderView", theFractionalPageFolderView), currentHashCode, theFractionalPageFolderView);
        }
        {
            IndexedPageViewType theIndexedPageFolderView;
            theIndexedPageFolderView = this.getIndexedPageFolderView();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexedPageFolderView", theIndexedPageFolderView), currentHashCode, theIndexedPageFolderView);
        }
        {
            RestrictionType theRestriction;
            theRestriction = this.getRestriction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "restriction", theRestriction), currentHashCode, theRestriction);
        }
        {
            NonEmptyArrayOfBaseFolderIdsType theParentFolderIds;
            theParentFolderIds = this.getParentFolderIds();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parentFolderIds", theParentFolderIds), currentHashCode, theParentFolderIds);
        }
        {
            FolderQueryTraversalType theTraversal;
            theTraversal = this.getTraversal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "traversal", theTraversal), currentHashCode, theTraversal);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
