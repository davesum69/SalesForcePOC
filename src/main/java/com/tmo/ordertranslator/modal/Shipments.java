package com.tmo.ordertranslator.modal;

public class Shipments
{
    private Shipment[] Shipment;

    public Shipment[] getShipment ()
    {
        return Shipment;
    }

    public void setShipment (Shipment[] Shipment)
    {
        this.Shipment = Shipment;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Shipment = "+Shipment+"]";
    }
}