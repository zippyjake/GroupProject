/**
 ====================================================================
 @author Group 11
 @date 19 NOV 2023
 @section CSC 331
 @purpose Group Project - Custom car maker project
 ====================================================================
 */
package com.example.groupproject;

public class CarSuperClass {
    //variables
    private String make;
    private String model;
    private String color;
    private Boolean leather;
    private Boolean assist;
    private Boolean tinted;
    private Boolean cellular;
    private double basePrice;//TEMPORARY
    private double totalCost;

    //constructor
    public CarSuperClass(String make, String model, String color, Boolean leather, Boolean assist, Boolean tinted,
                         Boolean cellular, double basePrice, double totalCost) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.leather = leather;
        this.assist = assist;
        this.cellular= cellular;
        this.tinted = tinted;
        this.basePrice = basePrice;
        this.totalCost = totalCost;
    }

    //getters and setters

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Boolean getLeather() {
        return leather;
    }

    public Boolean getAssist() {
        return assist;
    }

    public Boolean getCellular() {
        return cellular;
    }

    public Boolean getTinted() {
        return tinted;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLeather(Boolean leather) {
        this.leather = leather;
    }

    public void setAssist(Boolean assist) {
        this.assist = assist;
    }

    public void setCellular(Boolean cellular) {
        this.cellular = cellular;
    }

    public void setTinted(Boolean tinted) {
        this.tinted = tinted;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    public void CalculateCost() {
        this.totalCost = basePrice*1.2;//PLACEHOLDER
    }

    //detailed description
    public String getDesc(){
        return String.format("Manufactured by %s, the %s, Price starting at %f",this.getMake(),this.getModel(),this.getBasePrice());//PLACEHOLDER
    }
    //Basic description
    @Override
    public String toString() {
        return String.format("Manufactured by %s, the %s, Price starting at %f",this.getMake(),this.getModel(),this.getBasePrice());//PLACEHOLDER
    }
}
