package com.example.groupproject;

public class ScaleMock extends Meep{
    public ScaleMock(String color, Boolean leather, Boolean assist, Boolean tinted,
                          Boolean cellular, double basePrice, double totalCost) {
        super( "ScaleMock", color, leather, assist, tinted, cellular, 49999, totalCost);
    }
    //detailed description
    public String getDesc(){
        String description = String.format("Meet the ScaleMock—a tough and versatile pickup truck ready for any adventure. " +
                "With its robust design and open-air capabilities, it's the perfect blend of off-road capability " +
                "and practical utility. The ScaleMock offers a comfortable interior and advanced features, making " +
                "it as suitable for daily drives as it is for off-road exploration. Known for its towing and hauling" +
                " prowess, this pickup embodies the spirit of freedom and capability, making the ScaleMock the ideal" +
                " choice for those who want a truck that can handle both work and play with ease.");//PLACEHOLDER

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
