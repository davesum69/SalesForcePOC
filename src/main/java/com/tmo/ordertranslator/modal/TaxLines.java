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
 *         &lt;element name="TaxLine" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}JurisdictionId"/>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}TaxRegionId"/>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}TaxIsInclusive"/>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}TaxName"/>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}TaxCode"/>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}TaxAmount"/>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}TaxRate"/>
 *                   &lt;element ref="{http://com.elasticpath/repo/common}TaxCalculationDate"/>
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
    "taxLine"
})
public  class TaxLines {

    @XmlElement(name = "TaxLine", required = true)
    protected List<TaxLine> taxLine;

    /**
     * Gets the value of the taxLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxLine }
     * 
     * 
     */
    public List<TaxLine> getTaxLine() {
        if (taxLine == null) {
            taxLine = new ArrayList<TaxLine>();
        }
        return this.taxLine;
    }
}


