package com.example.groupproject;

public class Collaborator extends Meep{
    public Collaborator(String color,Boolean leather, Boolean assist,Boolean tinted,
                   Boolean cellular,double basePrice, double totalCost) {
        super( "Collaborator", color, leather, assist, tinted, cellular, 49999, totalCost);
    }
    //detailed description
    public String getDesc(){
        String description = String.format("Introducing the Collaborator—an iconic model that marries classic charm with modern " +
                "flair. With its bold design and spacious interior, it's the epitome of family adventure. The " +
                "Collaborator offers a comfortable ride and cutting-edge features, making it equally at home in " +
                "the city or on scenic routes. Known for its durability, this model combines rugged capability " +
                "with a touch of luxury, making the Collaborator the perfect choice for those seeking a versatile " +
                "and stylish driving experience.");//PLACEHOLDER

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
