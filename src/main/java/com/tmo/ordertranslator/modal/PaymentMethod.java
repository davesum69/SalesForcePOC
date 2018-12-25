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
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TSafeAlias" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreditCardLastFourDigits" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="CreditCardExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="CreditCardExpirationYear" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="CreditCardNameOnAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreditCardAuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "paymentType",
    "tSafeAlias",
    "creditCardType",
    "creditCardLastFourDigits",
    "creditCardExpirationMonth",
    "creditCardExpirationYear",
    "creditCardNameOnAccount",
    "creditCardAuthorizationCode"
})
public  class PaymentMethod {

    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "TSafeAlias")
    @XmlSchemaType(name = "unsignedInt")
    protected long tSafeAlias;
    @XmlElement(name = "CreditCardType", required = true)
    protected String creditCardType;
    @XmlElement(name = "CreditCardLastFourDigits")
    @XmlSchemaType(name = "unsignedShort")
    protected int creditCardLastFourDigits;
    @XmlElement(name = "CreditCardExpirationMonth")
    @XmlSchemaType(name = "unsignedByte")
    protected short creditCardExpirationMonth;
    @XmlElement(name = "CreditCardExpirationYear")
    @XmlSchemaType(name = "unsignedShort")
    protected int creditCardExpirationYear;
    @XmlElement(name = "CreditCardNameOnAccount", required = true)
    protected String creditCardNameOnAccount;
    @XmlElement(name = "CreditCardAuthorizationCode", required = true)
    protected String creditCardAuthorizationCode;

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the tSafeAlias property.
     * 
     */
    public long getTSafeAlias() {
        return tSafeAlias;
    }

    /**
     * Sets the value of the tSafeAlias property.
     * 
     */
    public void setTSafeAlias(long value) {
        this.tSafeAlias = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the creditCardLastFourDigits property.
     * 
     */
    public int getCreditCardLastFourDigits() {
        return creditCardLastFourDigits;
    }

    /**
     * Sets the value of the creditCardLastFourDigits property.
     * 
     */
    public void setCreditCardLastFourDigits(int value) {
        this.creditCardLastFourDigits = value;
    }

    /**
     * Gets the value of the creditCardExpirationMonth property.
     * 
     */
    public short getCreditCardExpirationMonth() {
        return creditCardExpirationMonth;
    }

    /**
     * Sets the value of the creditCardExpirationMonth property.
     * 
     */
    public void setCreditCardExpirationMonth(short value) {
        this.creditCardExpirationMonth = value;
    }

    /**
     * Gets the value of the creditCardExpirationYear property.
     * 
     */
    public int getCreditCardExpirationYear() {
        return creditCardExpirationYear;
    }

    /**
     * Sets the value of the creditCardExpirationYear property.
     * 
     */
    public void setCreditCardExpirationYear(int value) {
        this.creditCardExpirationYear = value;
    }

    /**
     * Gets the value of the creditCardNameOnAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNameOnAccount() {
        return creditCardNameOnAccount;
    }

    /**
     * Sets the value of the creditCardNameOnAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNameOnAccount(String value) {
        this.creditCardNameOnAccount = value;
    }

    /**
     * Gets the value of the creditCardAuthorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardAuthorizationCode() {
        return creditCardAuthorizationCode;
    }

    /**
     * Sets the value of the creditCardAuthorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardAuthorizationCode(String value) {
        this.creditCardAuthorizationCode = value;
    }

}




        