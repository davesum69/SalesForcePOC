package com.tmo.ordertranslator.modal;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lineItemId",
    "itemType",
    "productCode",
    "itemCode",
    "quantity",
    "strikeThroughPrice",
    "suggestedRetailPrice",
    "priceAfterDiscount",
    "displayName",
    "mandatory",
    "inventoryStatus",
    "options",
    "fields",
    "discountLines",
    "taxLines"
})
public class LineItem {

    @XmlElement(name = "LineItemId", required = true)
    protected String lineItemId;
    @XmlElement(name = "ItemType", required = true)
    protected String itemType;
    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;
    @XmlElement(name = "ItemCode", required = true)
    protected String itemCode;
    @XmlElement(name = "Quantity")
    @XmlSchemaType(name = "unsignedByte")
    protected short quantity;
    @XmlElement(name = "StrikeThroughPrice", required = true)
    protected BigDecimal strikeThroughPrice;
    @XmlElement(name = "SuggestedRetailPrice", required = true)
    protected BigDecimal suggestedRetailPrice;
    @XmlElement(name = "PriceAfterDiscount", required = true)
    protected BigDecimal priceAfterDiscount;
    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "Mandatory", required = true)
    protected String mandatory;
    @XmlElement(name = "InventoryStatus", required = true)
    protected String inventoryStatus;
    @XmlElement(name = "Options", required = true)
    protected Object options;
    @XmlElement(name = "Fields", required = true)
    protected Fields fields;
    @XmlElement(name = "DiscountLines", required = true)
    protected Object discountLines;
    @XmlElement(name = "TaxLines", required = true)
    protected TaxLines taxLines;

    /**
     * Gets the value of the lineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemId() {
        return lineItemId;
    }

    /**
     * Sets the value of the lineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemId(String value) {
        this.lineItemId = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public short getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(short value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the strikeThroughPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrikeThroughPrice() {
        return strikeThroughPrice;
    }

    /**
     * Sets the value of the strikeThroughPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrikeThroughPrice(BigDecimal value) {
        this.strikeThroughPrice = value;
    }

    /**
     * Gets the value of the suggestedRetailPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuggestedRetailPrice() {
        return suggestedRetailPrice;
    }

    /**
     * Sets the value of the suggestedRetailPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuggestedRetailPrice(BigDecimal value) {
        this.suggestedRetailPrice = value;
    }

    /**
     * Gets the value of the priceAfterDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceAfterDiscount() {
        return priceAfterDiscount;
    }

    /**
     * Sets the value of the priceAfterDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceAfterDiscount(BigDecimal value) {
        this.priceAfterDiscount = value;
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
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandatory(String value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the inventoryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryStatus() {
        return inventoryStatus;
    }

    /**
     * Sets the value of the inventoryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryStatus(String value) {
        this.inventoryStatus = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOptions(Object value) {
        this.options = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link Fields }
     *     
     */
    public Fields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fields }
     *     
     */
    public void setFields(Fields value) {
        this.fields = value;
    }

    /**
     * Gets the value of the discountLines property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDiscountLines() {
        return discountLines;
    }

    /**
     * Sets the value of the discountLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDiscountLines(Object value) {
        this.discountLines = value;
    }

    /**
     * Gets the value of the taxLines property.
     * 
     * @return
     *     possible object is
     *     {@link TaxLines }
     *     
     */
    public TaxLines getTaxLines() {
        return taxLines;
    }

    /**
     * Sets the value of the taxLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxLines }
     *     
     */
    public void setTaxLines(TaxLines value) {
        this.taxLines = value;
    }
}
