package com.tmo.ordertranslator.modal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Shipment"
})
public class Shipments {

@JsonProperty("Shipment")
private Shipment shipment;

@JsonProperty("Shipment")
public Shipment getShipment() {
return shipment;
}

@JsonProperty("Shipment")
public void setShipment(Shipment shipment) {
this.shipment = shipment;
}

}