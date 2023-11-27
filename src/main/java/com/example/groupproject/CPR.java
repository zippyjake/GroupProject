package com.example.groupproject;

public class CPR extends Ronda{
    public CPR(String color,Boolean leather, Boolean assist,Boolean tinted,
                Boolean cellular,double basePrice, double totalCost) {
        super( "CP-R", color, leather, assist, tinted, cellular, 49999, totalCost);
    }
    //detailed description
    public String getDesc(){
        String description = String.format("CP-R: a versatile SUV that blends comfort and functionality. With its spacious interior " +
                "and smart features, it's designed for family adventures and everyday convenience. The CP-R offers a " +
                "smooth ride and fuel efficiency, making it a reliable companion for both city drives and road trips. " +
                "Packed with safety features and a reputation for durability, the CP-R is your go-to SUV for a " +
                "comfortable and worry-free driving experience.");//PLACEHOLDER

        if (this.getLeather() == true) {
            description += "\n\u2022 The interior is lined with premium leather seats, providing the utmost comfort and luxury. ";
        }
        if(this. getAssist() == true) {
            description += "\n\u2022 The vehicle is equipped with a driver's assistance package, which includes adaptive cruise control, lane keep assist, and blind spot monitoring. ";
        }
        if (this.getCellular() == true){
            description += "\n\u2022 The vehicle is equipped with a cellular modem, providing Wi-Fi connectivity for all passengers. ";
        }
        if (this.getTinted() == true){
            description += "\n\u2022 The vehicle is equipped with tinted windows, providing privacy and protection from the sun. ";
        }

        description += String.format("\nThe total cost of the vehicle is $" );

        return description;
    }

}
