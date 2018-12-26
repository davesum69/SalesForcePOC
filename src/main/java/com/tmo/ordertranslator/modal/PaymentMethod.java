package com.tmo.ordertranslator.modal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"type",
"PaymentType",
"TSafeAlias",
"CreditCardType",
"CreditCardLastFourDigits",
"CreditCardExpirationMonth",
"CreditCardExpirationYear",
"CreditCardNameOnAccount",
"CreditCardAuthorizationCode"
})
public class PaymentMethod {

@JsonProperty("type")
private String type;
@JsonProperty("PaymentType")
private String paymentType;
@JsonProperty("TSafeAlias")
private String tSafeAlias;
@JsonProperty("CreditCardType")
private String creditCardType;
@JsonProperty("CreditCardLastFourDigits")
private String creditCardLastFourDigits;
@JsonProperty("CreditCardExpirationMonth")
private String creditCardExpirationMonth;
@JsonProperty("CreditCardExpirationYear")
private String creditCardExpirationYear;
@JsonProperty("CreditCardNameOnAccount")
private String creditCardNameOnAccount;
@JsonProperty("CreditCardAuthorizationCode")
private String creditCardAuthorizationCode;

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

@JsonProperty("PaymentType")
public String getPaymentType() {
return paymentType;
}

@JsonProperty("PaymentType")
public void setPaymentType(String paymentType) {
this.paymentType = paymentType;
}

@JsonProperty("TSafeAlias")
public String getTSafeAlias() {
return tSafeAlias;
}

@JsonProperty("TSafeAlias")
public void setTSafeAlias(String tSafeAlias) {
this.tSafeAlias = tSafeAlias;
}

@JsonProperty("CreditCardType")
public String getCreditCardType() {
return creditCardType;
}

@JsonProperty("CreditCardType")
public void setCreditCardType(String creditCardType) {
this.creditCardType = creditCardType;
}

@JsonProperty("CreditCardLastFourDigits")
public String getCreditCardLastFourDigits() {
return creditCardLastFourDigits;
}

@JsonProperty("CreditCardLastFourDigits")
public void setCreditCardLastFourDigits(String creditCardLastFourDigits) {
this.creditCardLastFourDigits = creditCardLastFourDigits;
}

@JsonProperty("CreditCardExpirationMonth")
public String getCreditCardExpirationMonth() {
return creditCardExpirationMonth;
}

@JsonProperty("CreditCardExpirationMonth")
public void setCreditCardExpirationMonth(String creditCardExpirationMonth) {
this.creditCardExpirationMonth = creditCardExpirationMonth;
}

@JsonProperty("CreditCardExpirationYear")
public String getCreditCardExpirationYear() {
return creditCardExpirationYear;
}

@JsonProperty("CreditCardExpirationYear")
public void setCreditCardExpirationYear(String creditCardExpirationYear) {
this.creditCardExpirationYear = creditCardExpirationYear;
}

@JsonProperty("CreditCardNameOnAccount")
public String getCreditCardNameOnAccount() {
return creditCardNameOnAccount;
}

@JsonProperty("CreditCardNameOnAccount")
public void setCreditCardNameOnAccount(String creditCardNameOnAccount) {
this.creditCardNameOnAccount = creditCardNameOnAccount;
}

@JsonProperty("CreditCardAuthorizationCode")
public String getCreditCardAuthorizationCode() {
return creditCardAuthorizationCode;
}

@JsonProperty("CreditCardAuthorizationCode")
public void setCreditCardAuthorizationCode(String creditCardAuthorizationCode) {
this.creditCardAuthorizationCode = creditCardAuthorizationCode;
}

}        