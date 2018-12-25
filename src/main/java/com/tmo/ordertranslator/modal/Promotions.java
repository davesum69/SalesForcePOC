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
 *         &lt;element name="Promotion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="coupons" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="discountValue" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                   &lt;element name="discountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="discountTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "promotion"
})
public  class Promotions {

    @XmlElement(name = "Promotion", required = true)
    protected Promotion promotion;

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link Order.Header.Promotions.Promotion }
     *     
     */
    public Promotion getPromotion() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.Header.Promotions.Promotion }
     *     
     */
    public void setPromotion(Promotion value) {
        this.promotion = value;
    }
}
