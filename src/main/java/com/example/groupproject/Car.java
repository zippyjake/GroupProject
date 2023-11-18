package com.example.groupproject;

public class Car {
    private String type;
    private String color;
    private String shippingLocation;
    private String paymentType;
    private double totalCost;
    private String[] premiumFeatures;

    public Car(String type, String color, String shippingLocation, String paymentType, double totalCost) {
        this.type = type;
        this.color = color;
        this.shippingLocation = shippingLocation;
        this.paymentType = paymentType;
        this.totalCost = totalCost;
    }

}
