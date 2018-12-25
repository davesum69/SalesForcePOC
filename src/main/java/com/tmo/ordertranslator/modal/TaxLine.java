package com.tmo.ordertranslator.modal;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

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
 *         &lt;element ref="{http://com.elasticpath/repo/common}JurisdictionId"/>
 *         &lt;element ref="{http://com.elasticpath/repo/common}TaxRegionId"/>
 *         &lt;element ref="{http://com.elasticpath/repo/common}TaxIsInclusive"/>
 *         &lt;element ref="{http://com.elasticpath/repo/common}TaxName"/>
 *         &lt;element ref="{http://com.elasticpath/repo/common}TaxCode"/>
 *         &lt;element ref="{http://com.elasticpath/repo/common}TaxAmount"/>
 *         &lt;element ref="{http://com.elasticpath/repo/common}TaxRate"/>
 *         &lt;element ref="{http://com.elasticpath/repo/common}TaxCalculationDate"/>
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
    "jurisdictionId",
    "taxRegionId",
    "taxIsInclusive",
    "taxName",
    "taxCode",
    "taxAmount",
    "taxRate",
    "taxCalculationDate"
})
public class TaxLine {

    @XmlElement(name = "JurisdictionId", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String jurisdictionId;
    @XmlElement(name = "TaxRegionId", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String taxRegionId;
    @XmlElement(name = "TaxIsInclusive", namespace = "http://com.elasticpath/repo/common")
    protected boolean taxIsInclusive;
    @XmlElement(name = "TaxName", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String taxName;
    @XmlElement(name = "TaxCode", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String taxCode;
    @XmlElement(name = "TaxAmount", namespace = "http://com.elasticpath/repo/common", required = true)
    protected BigDecimal taxAmount;
    @XmlElement(name = "TaxRate", namespace = "http://com.elasticpath/repo/common", required = true)
    protected BigDecimal taxRate;
    @XmlElement(name = "TaxCalculationDate", namespace = "http://com.elasticpath/repo/common", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar taxCalculationDate;

    /**
     * Gets the value of the jurisdictionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdictionId() {
        return jurisdictionId;
    }

    /**
     * Sets the value of the jurisdictionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdictionId(String value) {
        this.jurisdictionId = value;
    }

    /**
     * Gets the value of the taxRegionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegionId() {
        return taxRegionId;
    }

    /**
     * Sets the value of the taxRegionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegionId(String value) {
        this.taxRegionId = value;
    }

    /**
     * Gets the value of the taxIsInclusive property.
     * 
     */
    public boolean isTaxIsInclusive() {
        return taxIsInclusive;
    }

    /**
     * Sets the value of the taxIsInclusive property.
     * 
     */
    public void setTaxIsInclusive(boolean value) {
        this.taxIsInclusive = value;
    }

    /**
     * Gets the value of the taxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxName() {
        return taxName;
    }

    /**
     * Sets the value of the taxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxCalculationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxCalculationDate() {
        return taxCalculationDate;
    }

    /**
     * Sets the value of the taxCalculationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxCalculationDate(XMLGregorianCalendar value) {
        this.taxCalculationDate = value;
    }

}