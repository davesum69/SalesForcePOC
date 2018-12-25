package com.tmo.ordertranslator.modal;

import com.tmo.ordertranslator.modal.LineItems;
import com.tmo.ordertranslator.modal.ShippingAddress;

import java.math.BigDecimal;

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
 *         &lt;element name="ShipmentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipmentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShippingCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShippingAddress">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}AddressId"/>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}AddressType"/>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}FirstName"/>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}LastName"/>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}Street1"/>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}City"/>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}Region"/>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}Country"/>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}ZipPostalCode"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ShipmentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipmentOptionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LineItems">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LineItem" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LineItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ItemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                             &lt;element name="StrikeThroughPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="SuggestedRetailPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="PriceAfterDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="InventoryStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Options" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="Fields">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Field" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element ref="{http://com.elasticpath/repo/common}Key"/>
 *                                                 &lt;element ref="{http://com.elasticpath/repo/common}Value"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DiscountLines" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="TaxLines">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TaxLine" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element ref="{http://com.elasticpath/repo/common}JurisdictionId"/>
 *                                                 &lt;element ref="{http://com.elasticpath/repo/common}TaxRegionId"/>
 *                                                 &lt;element ref="{http://com.elasticpath/repo/common}TaxIsInclusive"/>
 *                                                 &lt;element ref="{http://com.elasticpath/repo/common}TaxName"/>
 *                                                 &lt;element ref="{http://com.elasticpath/repo/common}TaxCode"/>
 *                                                 &lt;element ref="{http://com.elasticpath/repo/common}TaxAmount"/>
 *                                                 &lt;element ref="{http://com.elasticpath/repo/common}TaxRate"/>
 *                                                 &lt;element ref="{http://com.elasticpath/repo/common}TaxCalculationDate"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *         &lt;element name="ShippingTaxLines" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "shipmentId",
    "shipmentStatus",
    "shippingCost",
    "discountAmount",
    "serviceLevel",
    "shippingAddress",
    "shipmentType",
    "shipmentOptionDescription",
    "lineItems",
    "shippingTaxLines"
})
public class Shipment {

    @XmlElement(name = "ShipmentId", required = true)
    protected String shipmentId;
    @XmlElement(name = "ShipmentStatus", required = true)
    protected String shipmentStatus;
    @XmlElement(name = "ShippingCost", required = true)
    protected BigDecimal shippingCost;
    @XmlElement(name = "DiscountAmount", required = true)
    protected BigDecimal discountAmount;
    @XmlElement(name = "ServiceLevel", required = true)
    protected String serviceLevel;
    @XmlElement(name = "ShippingAddress", required = true)
    protected ShippingAddress shippingAddress;
    @XmlElement(name = "ShipmentType", required = true)
    protected String shipmentType;
    @XmlElement(name = "ShipmentOptionDescription", required = true)
    protected String shipmentOptionDescription;
    @XmlElement(name = "LineItems", required = true)
    protected LineItems lineItems;
    @XmlElement(name = "ShippingTaxLines", required = true)
    protected Object shippingTaxLines;

    /**
     * Gets the value of the shipmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentId() {
        return shipmentId;
    }

    /**
     * Sets the value of the shipmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentId(String value) {
        this.shipmentId = value;
    }

    /**
     * Gets the value of the shipmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentStatus() {
        return shipmentStatus;
    }

    /**
     * Sets the value of the shipmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentStatus(String value) {
        this.shipmentStatus = value;
    }

    /**
     * Gets the value of the shippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShippingCost() {
        return shippingCost;
    }

    /**
     * Sets the value of the shippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShippingCost(BigDecimal value) {
        this.shippingCost = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Order.Shipments.Shipment.ShippingAddress }
     *     
     */
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.Shipments.Shipment.ShippingAddress }
     *     
     */
    public void setShippingAddress(ShippingAddress value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the shipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentType() {
        return shipmentType;
    }

    /**
     * Sets the value of the shipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentType(String value) {
        this.shipmentType = value;
    }

    /**
     * Gets the value of the shipmentOptionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentOptionDescription() {
        return shipmentOptionDescription;
    }

    /**
     * Sets the value of the shipmentOptionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentOptionDescription(String value) {
        this.shipmentOptionDescription = value;
    }

    /**
     * Gets the value of the lineItems property.
     * 
     * @return
     *     possible object is
     *     {@link Order.Shipments.Shipment.LineItems }
     *     
     */
    public LineItems getLineItems() {
        return lineItems;
    }

    /**
     * Sets the value of the lineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.Shipments.Shipment.LineItems }
     *     
     */
    public void setLineItems(LineItems value) {
        this.lineItems = value;
    }

    /**
     * Gets the value of the shippingTaxLines property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShippingTaxLines() {
        return shippingTaxLines;
    }

    /**
     * Sets the value of the shippingTaxLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShippingTaxLines(Object value) {
        this.shippingTaxLines = value;
    }
}


