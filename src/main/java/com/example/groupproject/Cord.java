package com.example.groupproject;

public class Cord extends Ronda{
    public Cord(String color,Boolean leather, Boolean assist,Boolean tinted,
                   Boolean cellular,double basePrice, double totalCost) {
        super( "Cord", color, leather, assist, tinted, cellular, 49999, totalCost);
    }
    //detailed description
    public String getDesc(){
        return String.format("Introducing the Cord—a stylish sedan that combines comfort and performance. With its sleek design and fuel efficiency, it's perfect for both city commuting and long drives. The Cord offers a spacious and modern interior, packed with tech features for a connected driving experience. Known for its reliability, this sedan delivers a smooth ride and stands out as a practical yet sophisticated choice for those seeking a well-rounded driving experience.",this.getMake(),this.getModel(),this.getTotalCost());//PLACEHOLDER
    }
}
