/**
 ====================================================================
 @author Group 11
 @date 21 NOV 2023
 @section CSC 331
 @purpose Group Project - Car SuperClass
 ====================================================================
 */
package com.example.groupproject;

public class CarSuperClass {
    //variables
    private String make;//specified by manufacuter subclass
    private String model;//specified by vehicle subclass
    private String color;
    private Boolean leather;
    private Boolean assist;
    private Boolean tinted;
    private Boolean cellular;
    private double basePrice;//specified by vehicle subclass
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

    //Getters
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

    //Setters
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
    //Calculate the total price of the vehicle taking into account the premium features
    public void CalculateCost() {
        double newTotal= basePrice;
        if (getColor().equals( "silver")){
            newTotal+=10000;//price of color
        }
        if (getLeather()){
            newTotal+= 5000;//price of leather
        }
        if (getAssist()){
            newTotal+=2500;//price of drivers assist
        }
        if(getCellular()){
            newTotal+=2000;//price of Car Wi-Fi
        }
        if(getTinted()){
            newTotal+=1000;//price of tinted windows
        }

        this.totalCost = newTotal;
    }

    //detailed description- small paragraph
    public String getDesc(){
        String description = String.format("Manufactured by %s, the %s comes in a %s color.%n",this.getMake(),this.getModel(),this.getColor());
        
        // if statements to check if the car has the premium features
        if (this.getLeather()){
            description += "The interior is lined with premium leather seats, providing the utmost comfort and luxury.%n";
        }
        if (this.getAssist()){
            description += "The vehicle is equipped with a driver's assistance package, which includes adaptive cruise control, lane keep assist, and blind spot monitoring.%n";
        }
        if (this.getCellular()){
            description += "The vehicle is equipped with a cellular modem, providing Wi-Fi connectivity for all passengers.%n";
        }
        if (this.getTinted()){
            description += "The vehicle is equipped with tinted windows, providing privacy and protection from the sun.%n";
        }
        description += String.format("The total cost of this vehicle is $%.2f.%n",this.getTotalCost());

        return description;
    }
    //Basic description- short summary
    @Override
    public String toString() {
        return String.format("Manufactured by %s, the %s, starting at $%s",
                this.getMake(),this.getModel(),String.format("%.2f",this.getBasePrice()));
    }
}
