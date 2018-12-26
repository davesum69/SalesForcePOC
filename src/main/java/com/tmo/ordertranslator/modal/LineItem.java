package com.tmo.ordertranslator.modal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"LineItemId",
"ItemType",
"ProductCode",
"ItemCode",
"Quantity",
"StrikeThroughPrice",
"SuggestedRetailPrice",
"PriceAfterDiscount",
"DisplayName",
"Mandatory",
"InventoryStatus",
"Options",
"Fields",
"DiscountLines",
"TaxLines"
})
public class LineItem {

@JsonProperty("LineItemId")
private String lineItemId;
@JsonProperty("ItemType")
private String itemType;
@JsonProperty("ProductCode")
private String productCode;
@JsonProperty("ItemCode")
private String itemCode;
@JsonProperty("Quantity")
private String quantity;
@JsonProperty("StrikeThroughPrice")
private String strikeThroughPrice;
@JsonProperty("SuggestedRetailPrice")
private String suggestedRetailPrice;
@JsonProperty("PriceAfterDiscount")
private String priceAfterDiscount;
@JsonProperty("DisplayName")
private String displayName;
@JsonProperty("Mandatory")
private String mandatory;
@JsonProperty("InventoryStatus")
private String inventoryStatus;
@JsonProperty("Options")
private Object options;
@JsonProperty("Fields")
private Fields_ fields;
@JsonProperty("DiscountLines")
private Object discountLines;
@JsonProperty("TaxLines")
private TaxLines taxLines;

@JsonProperty("LineItemId")
public String getLineItemId() {
return lineItemId;
}

@JsonProperty("LineItemId")
public void setLineItemId(String lineItemId) {
this.lineItemId = lineItemId;
}

@JsonProperty("ItemType")
public String getItemType() {
return itemType;
}

@JsonProperty("ItemType")
public void setItemType(String itemType) {
this.itemType = itemType;
}

@JsonProperty("ProductCode")
public String getProductCode() {
return productCode;
}

@JsonProperty("ProductCode")
public void setProductCode(String productCode) {
this.productCode = productCode;
}

@JsonProperty("ItemCode")
public String getItemCode() {
return itemCode;
}

@JsonProperty("ItemCode")
public void setItemCode(String itemCode) {
this.itemCode = itemCode;
}

@JsonProperty("Quantity")
public String getQuantity() {
return quantity;
}

@JsonProperty("Quantity")
public void setQuantity(String quantity) {
this.quantity = quantity;
}

@JsonProperty("StrikeThroughPrice")
public String getStrikeThroughPrice() {
return strikeThroughPrice;
}

@JsonProperty("StrikeThroughPrice")
public void setStrikeThroughPrice(String strikeThroughPrice) {
this.strikeThroughPrice = strikeThroughPrice;
}

@JsonProperty("SuggestedRetailPrice")
public String getSuggestedRetailPrice() {
return suggestedRetailPrice;
}

@JsonProperty("SuggestedRetailPrice")
public void setSuggestedRetailPrice(String suggestedRetailPrice) {
this.suggestedRetailPrice = suggestedRetailPrice;
}

@JsonProperty("PriceAfterDiscount")
public String getPriceAfterDiscount() {
return priceAfterDiscount;
}

@JsonProperty("PriceAfterDiscount")
public void setPriceAfterDiscount(String priceAfterDiscount) {
this.priceAfterDiscount = priceAfterDiscount;
}

@JsonProperty("DisplayName")
public String getDisplayName() {
return displayName;
}

@JsonProperty("DisplayName")
public void setDisplayName(String displayName) {
this.displayName = displayName;
}

@JsonProperty("Mandatory")
public String getMandatory() {
return mandatory;
}

@JsonProperty("Mandatory")
public void setMandatory(String mandatory) {
this.mandatory = mandatory;
}

@JsonProperty("InventoryStatus")
public String getInventoryStatus() {
return inventoryStatus;
}

@JsonProperty("InventoryStatus")
public void setInventoryStatus(String inventoryStatus) {
this.inventoryStatus = inventoryStatus;
}

@JsonProperty("Options")
public Object getOptions() {
return options;
}

@JsonProperty("Options")
public void setOptions(Object options) {
this.options = options;
}

@JsonProperty("Fields")
public Fields_ getFields() {
return fields;
}

@JsonProperty("Fields")
public void setFields(Fields_ fields) {
this.fields = fields;
}

@JsonProperty("DiscountLines")
public Object getDiscountLines() {
return discountLines;
}

@JsonProperty("DiscountLines")
public void setDiscountLines(Object discountLines) {
this.discountLines = discountLines;
}

@JsonProperty("TaxLines")
public TaxLines getTaxLines() {
return taxLines;
}

@JsonProperty("TaxLines")
public void setTaxLines(TaxLines taxLines) {
this.taxLines = taxLines;
}

}