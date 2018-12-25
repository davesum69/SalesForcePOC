package com.tmo.ordertranslator.modal;

import java.math.BigDecimal;

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
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coupons" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="discountValue" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="discountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="discountTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "type",
    "name",
    "displayName",
    "coupons",
    "expirationDate",
    "discountValue",
    "discountType",
    "discountTotalAmount"
})
public class Promotion {

    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String displayName;
    @XmlElement(required = true)
    protected Object coupons;
    @XmlElement(required = true)
    protected String expirationDate;
    @XmlSchemaType(name = "unsignedByte")
    protected short discountValue;
    @XmlElement(required = true)
    protected String discountType;
    @XmlElement(required = true)
    protected BigDecimal discountTotalAmount;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the coupons property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCoupons() {
        return coupons;
    }

    /**
     * Sets the value of the coupons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCoupons(Object value) {
        this.coupons = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the discountValue property.
     * 
     */
    public short getDiscountValue() {
        return discountValue;
    }

    /**
     * Sets the value of the discountValue property.
     * 
     */
    public void setDiscountValue(short value) {
        this.discountValue = value;
    }

    /**
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountType(String value) {
        this.discountType = value;
    }

    /**
     * Gets the value of the discountTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountTotalAmount() {
        return discountTotalAmount;
    }

    /**
     * Sets the value of the discountTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountTotalAmount(BigDecimal value) {
        this.discountTotalAmount = value;
    }

}
