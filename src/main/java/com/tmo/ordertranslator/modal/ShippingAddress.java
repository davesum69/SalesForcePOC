package com.tmo.ordertranslator.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://com.elasticpath/repo/common}AddressId"/>
 *         &lt;element ref="{http://com.elasticpath/repo/common}AddressType"/>
 *         &lt;element ref="{http://com.elasticpath/repo/common}FirstName"/>
 *         &lt;element ref="{http://com.elasticpath/repo/common}LastName"/>
 *         &lt;element ref="{http://com.elasticpath/repo/common}Street1"/>
 *         &lt;element ref="{http://com.elasticpath/repo/common}City"/>
 *         &lt;element ref="{http://com.elasticpath/repo/common}Region"/>
 *         &lt;element ref="{http://com.elasticpath/repo/common}Country"/>
 *         &lt;element ref="{http://com.elasticpath/repo/common}ZipPostalCode"/>
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
    "addressId",
    "addressType",
    "firstName",
    "lastName",
    "street1",
    "city",
    "region",
    "country",
    "zipPostalCode"
})
public class ShippingAddress {

    @XmlElement(name = "AddressId", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String addressId;
    @XmlElement(name = "AddressType", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String addressType;
    @XmlElement(name = "FirstName", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String firstName;
    @XmlElement(name = "LastName", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String lastName;
    @XmlElement(name = "Street1", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String street1;
    @XmlElement(name = "City", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String city;
    @XmlElement(name = "Region", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String region;
    @XmlElement(name = "Country", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String country;
    @XmlElement(name = "ZipPostalCode", namespace = "http://com.elasticpath/repo/common")
    @XmlSchemaType(name = "unsignedShort")
    protected int zipPostalCode;

    /**
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressId(String value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the street1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * Sets the value of the street1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet1(String value) {
        this.street1 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the zipPostalCode property.
     * 
     */
    public int getZipPostalCode() {
        return zipPostalCode;
    }

    /**
     * Sets the value of the zipPostalCode property.
     * 
     */
    public void setZipPostalCode(int value) {
        this.zipPostalCode = value;
    }

}
