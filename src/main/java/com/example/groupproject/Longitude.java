package com.example.groupproject;

public class Longitude extends Meep{
    public Longitude(String color,Boolean leather, Boolean assist,Boolean tinted,
                   Boolean cellular,double basePrice, double totalCost) {
        super( "Longitude", color, leather, assist, tinted, cellular, 49999, totalCost);
    }
    //detailed description
    public String getDesc(){
        return String.format("Introducing the Longitude—an adventurous SUV built for exploration. With its rugged " +
                "design and off-road capabilities, it's ready to tackle both city streets and the great outdoors. " +
                "The Longitude offers a comfortable interior and modern features, making every journey a mix of " +
                "comfort and excitement. Whether you're navigating urban landscapes or venturing off the beaten " +
                "path, the Longitude is your reliable companion for a spirited and versatile ride.",this.getMake(),
                this.getModel(),this.getTotalCost());//PLACEHOLDER
    }
}

