package com.example.groupproject;

public class Civil extends Ronda{
    public Civil(String color,Boolean leather, Boolean assist,Boolean tinted,
                Boolean cellular,double basePrice, double totalCost) {
        super( "Civil", color, leather, assist, tinted, cellular, 49999, totalCost);
    }
    //detailed description
    public String getDesc(){
        return String.format("Make: %s, Model: %s, Total Cost: %f",this.getMake(),this.getModel(),this.getTotalCost());//PLACEHOLDER
    }
}