package com.tmo.ordertranslator.modal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Field"
})
public class Fields_ {

@JsonProperty("Field")
private Field_ field;

@JsonProperty("Field")
public Field_ getField() {
return field;
}

@JsonProperty("Field")
public void setField(Field_ field) {
this.field = field;
}

}