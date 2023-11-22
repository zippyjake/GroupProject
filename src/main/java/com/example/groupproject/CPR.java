package com.example.groupproject;

public class CPR extends Ronda{
    public CPR(String color,Boolean leather, Boolean assist,Boolean tinted,
                Boolean cellular,double basePrice, double totalCost) {
        super( "CP-R", color, leather, assist, tinted, cellular, 49999, totalCost);
    }
    //detailed description
    public String getDesc(){
        return String.format("CP-R: a versatile SUV that blends comfort and functionality. With its spacious interior and smart features, it's designed for family adventures and everyday convenience. The CP-R offers a smooth ride and fuel efficiency, making it a reliable companion for both city drives and road trips. Packed with safety features and a reputation for durability, the CP-R is your go-to SUV for a comfortable and worry-free driving experience.",this.getMake(),this.getModel(),this.getTotalCost());//PLACEHOLDER
    }
}
