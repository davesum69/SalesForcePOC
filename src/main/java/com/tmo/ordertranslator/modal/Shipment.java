package com.tmo.ordertranslator.modal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"ShipmentId",
"ShipmentStatus",
"ShippingCost",
"DiscountAmount",
"ServiceLevel",
"ShippingAddress",
"ShipmentType",
"ShipmentOptionDescription",
"LineItems",
"ShippingTaxLines"
})
public class Shipment {

@JsonProperty("ShipmentId")
private String shipmentId;
@JsonProperty("ShipmentStatus")
private String shipmentStatus;
@JsonProperty("ShippingCost")
private String shippingCost;
@JsonProperty("DiscountAmount")
private String discountAmount;
@JsonProperty("ServiceLevel")
private String serviceLevel;
@JsonProperty("ShippingAddress")
private ShippingAddress shippingAddress;
@JsonProperty("ShipmentType")
private String shipmentType;
@JsonProperty("ShipmentOptionDescription")
private String shipmentOptionDescription;
@JsonProperty("LineItems")
private LineItems lineItems;
@JsonProperty("ShippingTaxLines")
private Object shippingTaxLines;

@JsonProperty("ShipmentId")
public String getShipmentId() {
return shipmentId;
}

@JsonProperty("ShipmentId")
public void setShipmentId(String shipmentId) {
this.shipmentId = shipmentId;
}

@JsonProperty("ShipmentStatus")
public String getShipmentStatus() {
return shipmentStatus;
}

@JsonProperty("ShipmentStatus")
public void setShipmentStatus(String shipmentStatus) {
this.shipmentStatus = shipmentStatus;
}

@JsonProperty("ShippingCost")
public String getShippingCost() {
return shippingCost;
}

@JsonProperty("ShippingCost")
public void setShippingCost(String shippingCost) {
this.shippingCost = shippingCost;
}

@JsonProperty("DiscountAmount")
public String getDiscountAmount() {
return discountAmount;
}

@JsonProperty("DiscountAmount")
public void setDiscountAmount(String discountAmount) {
this.discountAmount = discountAmount;
}

@JsonProperty("ServiceLevel")
public String getServiceLevel() {
return serviceLevel;
}

@JsonProperty("ServiceLevel")
public void setServiceLevel(String serviceLevel) {
this.serviceLevel = serviceLevel;
}

@JsonProperty("ShippingAddress")
public ShippingAddress getShippingAddress() {
return shippingAddress;
}

@JsonProperty("ShippingAddress")
public void setShippingAddress(ShippingAddress shippingAddress) {
this.shippingAddress = shippingAddress;
}

@JsonProperty("ShipmentType")
public String getShipmentType() {
return shipmentType;
}

@JsonProperty("ShipmentType")
public void setShipmentType(String shipmentType) {
this.shipmentType = shipmentType;
}

@JsonProperty("ShipmentOptionDescription")
public String getShipmentOptionDescription() {
return shipmentOptionDescription;
}

@JsonProperty("ShipmentOptionDescription")
public void setShipmentOptionDescription(String shipmentOptionDescription) {
this.shipmentOptionDescription = shipmentOptionDescription;
}

@JsonProperty("LineItems")
public LineItems getLineItems() {
return lineItems;
}

@JsonProperty("LineItems")
public void setLineItems(LineItems lineItems) {
this.lineItems = lineItems;
}

@JsonProperty("ShippingTaxLines")
public Object getShippingTaxLines() {
return shippingTaxLines;
}

@JsonProperty("ShippingTaxLines")
public void setShippingTaxLines(Object shippingTaxLines) {
this.shippingTaxLines = shippingTaxLines;
}

}