package com.example.groupproject;

public class Mangler extends Meep{
    public Mangler(String color,Boolean leather, Boolean assist,Boolean tinted,
            Boolean cellular,double basePrice, double totalCost) {
        super( "Mangler", color, leather, assist, tinted, cellular, 49999, totalCost);
    }
    //detailed description
    public String getDesc(){
        return String.format("Meet the Mangler—a car that seamlessly combines luxury with sports, ready to conquer both city streets and off-road adventures. With its plush interiors and high-tech features, it offers a smooth and sophisticated ride in urban landscapes. It's also built to handle rugged terrains, providing an exhilarating off-road experience. Experience the best of both worlds with the Mangler, a versatile ride that effortlessly blends luxury, sports, and off-road capability for an extraordinary driving journey.",this.getMake(),this.getModel(),this.getTotalCost());//PLACEHOLDER
    }
}
