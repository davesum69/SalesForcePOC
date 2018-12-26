package com.tmo.ordertranslator.modal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Promotion"
})
public class Promotions {

@JsonProperty("Promotion")
private Promotion promotion;

@JsonProperty("Promotion")
public Promotion getPromotion() {
return promotion;
}

@JsonProperty("Promotion")
public void setPromotion(Promotion promotion) {
this.promotion = promotion;
}

}