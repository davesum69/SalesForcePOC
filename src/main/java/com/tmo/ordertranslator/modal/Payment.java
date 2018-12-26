package com.tmo.ordertranslator.modal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"PaymentId",
"Amount",
"TransactionType",
"TransactionDate",
"PaymentStatus",
"jPaymentId",
"PaymentMethod",
"ShipmentId"
})
public class Payment {

@JsonProperty("PaymentId")
private String paymentId;
@JsonProperty("Amount")
private String amount;
@JsonProperty("TransactionType")
private String transactionType;
@JsonProperty("TransactionDate")
private String transactionDate;
@JsonProperty("PaymentStatus")
private String paymentStatus;
@JsonProperty("jPaymentId")
private String jPaymentId;
@JsonProperty("PaymentMethod")
private PaymentMethod paymentMethod;
@JsonProperty("ShipmentId")
private String shipmentId;

@JsonProperty("PaymentId")
public String getPaymentId() {
return paymentId;
}

@JsonProperty("PaymentId")
public void setPaymentId(String paymentId) {
this.paymentId = paymentId;
}

@JsonProperty("Amount")
public String getAmount() {
return amount;
}

@JsonProperty("Amount")
public void setAmount(String amount) {
this.amount = amount;
}

@JsonProperty("TransactionType")
public String getTransactionType() {
return transactionType;
}

@JsonProperty("TransactionType")
public void setTransactionType(String transactionType) {
this.transactionType = transactionType;
}

@JsonProperty("TransactionDate")
public String getTransactionDate() {
return transactionDate;
}

@JsonProperty("TransactionDate")
public void setTransactionDate(String transactionDate) {
this.transactionDate = transactionDate;
}

@JsonProperty("PaymentStatus")
public String getPaymentStatus() {
return paymentStatus;
}

@JsonProperty("PaymentStatus")
public void setPaymentStatus(String paymentStatus) {
this.paymentStatus = paymentStatus;
}

@JsonProperty("jPaymentId")
public String getJPaymentId() {
return jPaymentId;
}

@JsonProperty("jPaymentId")
public void setJPaymentId(String jPaymentId) {
this.jPaymentId = jPaymentId;
}

@JsonProperty("PaymentMethod")
public PaymentMethod getPaymentMethod() {
return paymentMethod;
}

@JsonProperty("PaymentMethod")
public void setPaymentMethod(PaymentMethod paymentMethod) {
this.paymentMethod = paymentMethod;
}

@JsonProperty("ShipmentId")
public String getShipmentId() {
return shipmentId;
}

@JsonProperty("ShipmentId")
public void setShipmentId(String shipmentId) {
this.shipmentId = shipmentId;
}

}