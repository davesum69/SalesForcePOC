package com.tmo.ordertranslator.modal;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"OrderStatus",
"StoreCode",
"FlowType",
"ApplicationId",
"CreatedDate",
"Locale",
"Currency",
"OrderNumber",
"EmailFrom",
"TotalItemCostBeforeTax",
"TotalShippingCostBeforeTax",
"TotalItemTaxes",
"TotalShippingTaxes",
"TotalTaxes",
"TotalItemCostIncludingTax",
"TotalShippingCostIncludingTax",
"TotalLoanAmount",
"GrandTotal",
"Promotions",
"Fields"
})
public class Header {

@JsonProperty("OrderStatus")
private String orderStatus;
@JsonProperty("StoreCode")
private String storeCode;
@JsonProperty("FlowType")
private String flowType;
@JsonProperty("ApplicationId")
private String applicationId;
@JsonProperty("CreatedDate")
private String createdDate;
@JsonProperty("Locale")
private String locale;
@JsonProperty("Currency")
private String currency;
@JsonProperty("OrderNumber")
private String orderNumber;
@JsonProperty("EmailFrom")
private String emailFrom;
@JsonProperty("TotalItemCostBeforeTax")
private String totalItemCostBeforeTax;
@JsonProperty("TotalShippingCostBeforeTax")
private String totalShippingCostBeforeTax;
@JsonProperty("TotalItemTaxes")
private String totalItemTaxes;
@JsonProperty("TotalShippingTaxes")
private String totalShippingTaxes;
@JsonProperty("TotalTaxes")
private String totalTaxes;
@JsonProperty("TotalItemCostIncludingTax")
private String totalItemCostIncludingTax;
@JsonProperty("TotalShippingCostIncludingTax")
private String totalShippingCostIncludingTax;
@JsonProperty("TotalLoanAmount")
private String totalLoanAmount;
@JsonProperty("GrandTotal")
private String grandTotal;
@JsonProperty("Promotions")
private Promotions promotions;
@JsonProperty("Fields")
private Fields fields;

@JsonProperty("OrderStatus")
public String getOrderStatus() {
return orderStatus;
}

@JsonProperty("OrderStatus")
public void setOrderStatus(String orderStatus) {
this.orderStatus = orderStatus;
}

@JsonProperty("StoreCode")
public String getStoreCode() {
return storeCode;
}

@JsonProperty("StoreCode")
public void setStoreCode(String storeCode) {
this.storeCode = storeCode;
}

@JsonProperty("FlowType")
public String getFlowType() {
return flowType;
}

@JsonProperty("FlowType")
public void setFlowType(String flowType) {
this.flowType = flowType;
}

@JsonProperty("ApplicationId")
public String getApplicationId() {
return applicationId;
}

@JsonProperty("ApplicationId")
public void setApplicationId(String applicationId) {
this.applicationId = applicationId;
}

@JsonProperty("CreatedDate")
public String getCreatedDate() {
return createdDate;
}

@JsonProperty("CreatedDate")
public void setCreatedDate(String createdDate) {
this.createdDate = createdDate;
}

@JsonProperty("Locale")
public String getLocale() {
return locale;
}

@JsonProperty("Locale")
public void setLocale(String locale) {
this.locale = locale;
}

@JsonProperty("Currency")
public String getCurrency() {
return currency;
}

@JsonProperty("Currency")
public void setCurrency(String currency) {
this.currency = currency;
}

@JsonProperty("OrderNumber")
public String getOrderNumber() {
return orderNumber;
}

@JsonProperty("OrderNumber")
public void setOrderNumber(String orderNumber) {
this.orderNumber = orderNumber;
}

@JsonProperty("EmailFrom")
public String getEmailFrom() {
return emailFrom;
}

@JsonProperty("EmailFrom")
public void setEmailFrom(String emailFrom) {
this.emailFrom = emailFrom;
}

@JsonProperty("TotalItemCostBeforeTax")
public String getTotalItemCostBeforeTax() {
return totalItemCostBeforeTax;
}

@JsonProperty("TotalItemCostBeforeTax")
public void setTotalItemCostBeforeTax(String totalItemCostBeforeTax) {
this.totalItemCostBeforeTax = totalItemCostBeforeTax;
}

@JsonProperty("TotalShippingCostBeforeTax")
public String getTotalShippingCostBeforeTax() {
return totalShippingCostBeforeTax;
}

@JsonProperty("TotalShippingCostBeforeTax")
public void setTotalShippingCostBeforeTax(String totalShippingCostBeforeTax) {
this.totalShippingCostBeforeTax = totalShippingCostBeforeTax;
}

@JsonProperty("TotalItemTaxes")
public String getTotalItemTaxes() {
return totalItemTaxes;
}

@JsonProperty("TotalItemTaxes")
public void setTotalItemTaxes(String totalItemTaxes) {
this.totalItemTaxes = totalItemTaxes;
}

@JsonProperty("TotalShippingTaxes")
public String getTotalShippingTaxes() {
return totalShippingTaxes;
}

@JsonProperty("TotalShippingTaxes")
public void setTotalShippingTaxes(String totalShippingTaxes) {
this.totalShippingTaxes = totalShippingTaxes;
}

@JsonProperty("TotalTaxes")
public String getTotalTaxes() {
return totalTaxes;
}

@JsonProperty("TotalTaxes")
public void setTotalTaxes(String totalTaxes) {
this.totalTaxes = totalTaxes;
}

@JsonProperty("TotalItemCostIncludingTax")
public String getTotalItemCostIncludingTax() {
return totalItemCostIncludingTax;
}

@JsonProperty("TotalItemCostIncludingTax")
public void setTotalItemCostIncludingTax(String totalItemCostIncludingTax) {
this.totalItemCostIncludingTax = totalItemCostIncludingTax;
}

@JsonProperty("TotalShippingCostIncludingTax")
public String getTotalShippingCostIncludingTax() {
return totalShippingCostIncludingTax;
}

@JsonProperty("TotalShippingCostIncludingTax")
public void setTotalShippingCostIncludingTax(String totalShippingCostIncludingTax) {
this.totalShippingCostIncludingTax = totalShippingCostIncludingTax;
}

@JsonProperty("TotalLoanAmount")
public String getTotalLoanAmount() {
return totalLoanAmount;
}

@JsonProperty("TotalLoanAmount")
public void setTotalLoanAmount(String totalLoanAmount) {
this.totalLoanAmount = totalLoanAmount;
}

@JsonProperty("GrandTotal")
public String getGrandTotal() {
return grandTotal;
}

@JsonProperty("GrandTotal")
public void setGrandTotal(String grandTotal) {
this.grandTotal = grandTotal;
}

@JsonProperty("Promotions")
public Promotions getPromotions() {
return promotions;
}

@JsonProperty("Promotions")
public void setPromotions(Promotions promotions) {
this.promotions = promotions;
}

@JsonProperty("Fields")
public Fields getFields() {
return fields;
}

@JsonProperty("Fields")
public void setFields(Fields fields) {
this.fields = fields;
}

}