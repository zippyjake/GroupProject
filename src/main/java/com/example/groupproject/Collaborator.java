package com.example.groupproject;

public class Collaborator extends Meep{
    public Collaborator(String color,Boolean leather, Boolean assist,Boolean tinted,
                   Boolean cellular,double basePrice, double totalCost) {
        super( "Collaborator", color, leather, assist, tinted, cellular, 49999, totalCost);
    }
    //detailed description
    public String getDesc(){
        return String.format("Introducing the Collaborator—an iconic model that marries classic charm with modern " +
                "flair. With its bold design and spacious interior, it's the epitome of family adventure. The " +
                "Collaborator offers a comfortable ride and cutting-edge features, making it equally at home in " +
                "the city or on scenic routes. Known for its durability, this model combines rugged capability " +
                "with a touch of luxury, making the Collaborator the perfect choice for those seeking a versatile " +
                "and stylish driving experience.",this.getMake(),this.getModel(),this.getTotalCost());//PLACEHOLDER
    }
}
