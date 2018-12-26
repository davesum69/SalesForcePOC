package com.tmo.ordertranslator.modal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"LineItem"
})
public class LineItems {

@JsonProperty("LineItem")
private LineItem lineItem;

@JsonProperty("LineItem")
public LineItem getLineItem() {
return lineItem;
}

@JsonProperty("LineItem")
public void setLineItem(LineItem lineItem) {
this.lineItem = lineItem;
}

}