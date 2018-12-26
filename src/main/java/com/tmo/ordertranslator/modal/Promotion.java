package com.tmo.ordertranslator.modal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
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

@JsonProperty("type")
private String type;
@JsonProperty("name")
private String name;
@JsonProperty("displayName")
private String displayName;
@JsonProperty("coupons")
private Object coupons;
@JsonProperty("expirationDate")
private String expirationDate;
@JsonProperty("discountValue")
private String discountValue;
@JsonProperty("discountType")
private String discountType;
@JsonProperty("discountTotalAmount")
private String discountTotalAmount;

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("displayName")
public String getDisplayName() {
return displayName;
}

@JsonProperty("displayName")
public void setDisplayName(String displayName) {
this.displayName = displayName;
}

@JsonProperty("coupons")
public Object getCoupons() {
return coupons;
}

@JsonProperty("coupons")
public void setCoupons(Object coupons) {
this.coupons = coupons;
}

@JsonProperty("expirationDate")
public String getExpirationDate() {
return expirationDate;
}

@JsonProperty("expirationDate")
public void setExpirationDate(String expirationDate) {
this.expirationDate = expirationDate;
}

@JsonProperty("discountValue")
public String getDiscountValue() {
return discountValue;
}

@JsonProperty("discountValue")
public void setDiscountValue(String discountValue) {
this.discountValue = discountValue;
}

@JsonProperty("discountType")
public String getDiscountType() {
return discountType;
}

@JsonProperty("discountType")
public void setDiscountType(String discountType) {
this.discountType = discountType;
}

@JsonProperty("discountTotalAmount")
public String getDiscountTotalAmount() {
return discountTotalAmount;
}

@JsonProperty("discountTotalAmount")
public void setDiscountTotalAmount(String discountTotalAmount) {
this.discountTotalAmount = discountTotalAmount;
}

}