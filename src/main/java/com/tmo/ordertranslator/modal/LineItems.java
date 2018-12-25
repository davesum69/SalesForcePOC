package com.tmo.ordertranslator.modal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="LineItem" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LineItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ItemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                   &lt;element name="StrikeThroughPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="SuggestedRetailPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="PriceAfterDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="InventoryStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Options" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="Fields">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Field" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://com.elasticpath/repo/common}Key"/>
 *                                       &lt;element ref="{http://com.elasticpath/repo/common}Value"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DiscountLines" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="TaxLines">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TaxLine" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://com.elasticpath/repo/common}JurisdictionId"/>
 *                                       &lt;element ref="{http://com.elasticpath/repo/common}TaxRegionId"/>
 *                                       &lt;element ref="{http://com.elasticpath/repo/common}TaxIsInclusive"/>
 *                                       &lt;element ref="{http://com.elasticpath/repo/common}TaxName"/>
 *                                       &lt;element ref="{http://com.elasticpath/repo/common}TaxCode"/>
 *                                       &lt;element ref="{http://com.elasticpath/repo/common}TaxAmount"/>
 *                                       &lt;element ref="{http://com.elasticpath/repo/common}TaxRate"/>
 *                                       &lt;element ref="{http://com.elasticpath/repo/common}TaxCalculationDate"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "lineItem"
})
public  class LineItems {

    @XmlElement(name = "LineItem", required = true)
    protected List<LineItem> lineItem;

    /**
     * Gets the value of the lineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Order.Shipments.Shipment.LineItems.LineItem }
     * 
     * 
     */
    public List<LineItem> getLineItem() {
        if (lineItem == null) {
            lineItem = new ArrayList<LineItem>();
        }
        return this.lineItem;
    }
}
