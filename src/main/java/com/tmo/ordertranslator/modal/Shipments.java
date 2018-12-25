package com.tmo.ordertranslator.modal;

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
 *         &lt;element name="Shipment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ShipmentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ShipmentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ShippingCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ShippingAddress">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://com.elasticpath/repo/common}AddressId"/>
 *                             &lt;element ref="{http://com.elasticpath/repo/common}AddressType"/>
 *                             &lt;element ref="{http://com.elasticpath/repo/common}FirstName"/>
 *                             &lt;element ref="{http://com.elasticpath/repo/common}LastName"/>
 *                             &lt;element ref="{http://com.elasticpath/repo/common}Street1"/>
 *                             &lt;element ref="{http://com.elasticpath/repo/common}City"/>
 *                             &lt;element ref="{http://com.elasticpath/repo/common}Region"/>
 *                             &lt;element ref="{http://com.elasticpath/repo/common}Country"/>
 *                             &lt;element ref="{http://com.elasticpath/repo/common}ZipPostalCode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ShipmentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ShipmentOptionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="LineItems">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LineItem" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LineItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ItemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                                       &lt;element name="StrikeThroughPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                       &lt;element name="SuggestedRetailPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                       &lt;element name="PriceAfterDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                       &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="InventoryStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Options" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="Fields">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Field" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element ref="{http://com.elasticpath/repo/common}Key"/>
 *                                                           &lt;element ref="{http://com.elasticpath/repo/common}Value"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DiscountLines" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="TaxLines">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TaxLine" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element ref="{http://com.elasticpath/repo/common}JurisdictionId"/>
 *                                                           &lt;element ref="{http://com.elasticpath/repo/common}TaxRegionId"/>
 *                                                           &lt;element ref="{http://com.elasticpath/repo/common}TaxIsInclusive"/>
 *                                                           &lt;element ref="{http://com.elasticpath/repo/common}TaxName"/>
 *                                                           &lt;element ref="{http://com.elasticpath/repo/common}TaxCode"/>
 *                                                           &lt;element ref="{http://com.elasticpath/repo/common}TaxAmount"/>
 *                                                           &lt;element ref="{http://com.elasticpath/repo/common}TaxRate"/>
 *                                                           &lt;element ref="{http://com.elasticpath/repo/common}TaxCalculationDate"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
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
 *                   &lt;element name="ShippingTaxLines" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "shipment"
})
public  class Shipments {

    @XmlElement(name = "Shipment", required = true)
    protected Shipment shipment;

    /**
     * Gets the value of the shipment property.
     * 
     * @return
     *     possible object is
     *     {@link Order.Shipments.Shipment }
     *     
     */
    public Shipment getShipment() {
        return shipment;
    }

    /**
     * Sets the value of the shipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.Shipments.Shipment }
     *     
     */
    public void setShipment(Shipment value) {
        this.shipment = value;
    }
}
