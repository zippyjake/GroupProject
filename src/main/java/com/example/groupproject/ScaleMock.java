package com.example.groupproject;

public class ScaleMock extends Meep{
    public ScaleMock(String color, Boolean leather, Boolean assist, Boolean tinted,
                          Boolean cellular, double basePrice, double totalCost) {
        super( "ScaleMock", color, leather, assist, tinted, cellular, 49999, totalCost);
    }
    //detailed description
    public String getDesc(){
        return String.format("Meet the ScaleMock—a tough and versatile pickup truck ready for any adventure. With its robust design and open-air capabilities, it's the perfect blend of off-road capability and practical utility. The ScaleMock offers a comfortable interior and advanced features, making it as suitable for daily drives as it is for off-road exploration. Known for its towing and hauling prowess, this pickup embodies the spirit of freedom and capability, making the ScaleMock the ideal choice for those who want a truck that can handle both work and play with ease.",this.getMake(),this.getModel(),this.getTotalCost());//PLACEHOLDER
    }
}
