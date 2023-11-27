package com.example.groupproject;

public class Civil extends Ronda{
    public Civil(String color,Boolean leather, Boolean assist,Boolean tinted,
                Boolean cellular,double basePrice, double totalCost) {
        super( "Civil", color, leather, assist, tinted, cellular, 49999, totalCost);
    }
    //detailed description
    public String getDesc(){
        String description = String.format("Introducing the Civil—a compact car that's big on style and reliability. With its sleek " +
                "design and fuel efficiency, it's perfect for zipping around town. The Civil offers a comfortable ride, " +
                "modern features, and a reputation for dependability. Whether you're commuting or cruising, the Civil is " +
                "your go-to choice for a practical and enjoyable drive.");//PLACEHOLDER

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