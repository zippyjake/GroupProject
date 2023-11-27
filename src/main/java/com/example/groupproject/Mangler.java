package com.example.groupproject;

public class Mangler extends Meep{
    public Mangler(String color,Boolean leather, Boolean assist,Boolean tinted,
            Boolean cellular,double basePrice, double totalCost) {
        super( "Mangler", color, leather, assist, tinted, cellular, 49999, totalCost);
    }

    //detailed description
    public String getDesc(){
        String description = String.format("Meet the Mangler—a car that seamlessly combines luxury with sports, ready to conquer both " +
                "city streets and off-road adventures. With its plush interiors and high-tech features, it offers a " +
                "smooth and sophisticated ride in urban landscapes. It's also built to handle rugged terrains, " +
                "providing an exhilarating off-road experience. Experience the best of both worlds with the Mangler, " +
                "a versatile ride that effortlessly blends luxury, sports, and off-road capability for an extraordinary" +
                " driving journey. "); //PLACEHOLDER
        if (this.getLeather() == true) {
            description += "\n\u2022The interior is lined with premium leather seats, providing the utmost comfort and luxury. ";
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
