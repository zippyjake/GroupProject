package com.example.groupproject;

public class Ronda extends CarSuperClass {
    public Ronda(String model, String color,Boolean leather, Boolean assist,Boolean tinted,
                Boolean cellular,double basePrice, double totalCost) {
        super("Ronda",model,color,leather,assist,tinted,cellular,basePrice,totalCost);
    }
    //detailed description
    public String getDesc(){
        return String.format("Make: %s, Model: %s, Total Cost: %f",this.getMake(),this.getModel(),this.getTotalCost());//PLACEHOLDER
    }
}
