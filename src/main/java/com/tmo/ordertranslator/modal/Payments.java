package com.tmo.ordertranslator.modal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Payment"
})
public class Payments {

@JsonProperty("Payment")
private Payment payment;

@JsonProperty("Payment")
public Payment getPayment() {
return payment;
}

@JsonProperty("Payment")
public void setPayment(Payment payment) {
this.payment = payment;
}

}