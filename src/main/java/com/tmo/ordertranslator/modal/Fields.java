package com.tmo.ordertranslator.modal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Field"
})
public class Fields {

@JsonProperty("Field")
private Field field;

@JsonProperty("Field")
public Field getField() {
return field;
}

@JsonProperty("Field")
public void setField(Field field) {
this.field = field;
}

}