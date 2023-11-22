package com.example.groupproject;

public class Meep extends CarSuperClass {
    public Meep(String model, String color,Boolean leather, Boolean assist,Boolean tinted,
               Boolean cellular,double basePrice, double totalCost) {
        super("Meep",model,color,leather,assist,tinted,cellular,basePrice,totalCost);
    }
    //detailed description
    public String getDesc(){
        return String.format("%s, %s, %f",this.getMake(),this.getModel(),this.getTotalCost());//PLACEHOLDER
    }
}
