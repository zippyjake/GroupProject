package com.example.groupproject;

public class Longitude extends Meep{
    public Longitude(String color,Boolean leather, Boolean assist,Boolean tinted,
                   Boolean cellular,double basePrice, double totalCost) {
        super( "Longitude", color, leather, assist, tinted, cellular, 49999, totalCost);
    }
    //detailed description
    public String getDesc(){
        String description = String.format("Introducing the Longitude—an adventurous SUV built for exploration. With its rugged " +
                "design and off-road capabilities, it's ready to tackle both city streets and the great outdoors. " +
                "The Longitude offers a comfortable interior and modern features, making every journey a mix of " +
                "comfort and excitement. Whether you're navigating urban landscapes or venturing off the beaten " +
                "path, the Longitude is your reliable companion for a spirited and versatile ride.");//PLACEHOLDER

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

