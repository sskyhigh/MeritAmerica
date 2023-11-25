package com.shippingcompany;

import java.time.LocalDateTime;

public abstract class Delivery {
    private String origin;
    private String destination;
    private int distance;
    private Shipment shipment;

    public abstract int getDuration();

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDistance(String destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    protected int convertHoursToMinutes(double decimalHours) {
        int hours = (int) decimalHours; int minutes = (int) Math.round((decimalHours - hours) * 60);
        return hours * 60 + minutes;
    }

    public final LocalDateTime getExpectedArrival(LocalDateTime departure) {
        return departure.plusMinutes(getDuration());
    }
}
