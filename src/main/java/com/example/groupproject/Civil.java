package com.example.groupproject;

public class Civil extends Ronda{
    public Civil(String color,Boolean leather, Boolean assist,Boolean tinted,
                Boolean cellular,double basePrice, double totalCost) {
        super( "Civil", color, leather, assist, tinted, cellular, 49999, totalCost);
    }
    //detailed description
    public String getDesc(){
        return String.format("Introducing the Civil—a compact car that's big on style and reliability. With its sleek " +
                "design and fuel efficiency, it's perfect for zipping around town. The Civil offers a comfortable ride, " +
                "modern features, and a reputation for dependability. Whether you're commuting or cruising, the Civil is " +
                "your go-to choice for a practical and enjoyable drive.",this.getMake(),this.getModel(),this.getTotalCost());//PLACEHOLDER
    }
}