package com.tmo.ordertranslator.modal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"TaxLine"
})
public class TaxLines {

@JsonProperty("TaxLine")
private TaxLine taxLine;

@JsonProperty("TaxLine")
public TaxLine getTaxLine() {
return taxLine;
}

@JsonProperty("TaxLine")
public void setTaxLine(TaxLine taxLine) {
this.taxLine = taxLine;
}

}