package com.example.groupproject;

public class Cord extends Ronda{
    public Cord(String color,Boolean leather, Boolean assist,Boolean tinted,
                   Boolean cellular,double basePrice, double totalCost) {
        super( "Cord", color, leather, assist, tinted, cellular, 49999, totalCost);
    }
    //detailed description
    public String getDesc(){
        String description = String.format("Introducing the Cord—a stylish sedan that combines comfort and performance. With its " +
                "sleek design and fuel efficiency, it's perfect for both city commuting and long drives. The Cord " +
                "offers a spacious and modern interior, packed with tech features for a connected driving experience. " +
                "Known for its reliability, this sedan delivers a smooth ride and stands out as a practical yet " +
                "sophisticated choice for those seeking a well-rounded driving experience.");//PLACEHOLDER
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
