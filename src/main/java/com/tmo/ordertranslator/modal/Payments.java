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
 *         &lt;element name="Payment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="jPaymentId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                   &lt;element name="PaymentMethod">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TSafeAlias" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                             &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CreditCardLastFourDigits" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *                             &lt;element name="CreditCardExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                             &lt;element name="CreditCardExpirationYear" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *                             &lt;element name="CreditCardNameOnAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CreditCardAuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ShipmentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "payment"
})
public  class Payments {

    @XmlElement(name = "Payment", required = true)
    protected Payment payment;

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Order.Payments.Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.Payments.Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }
}
