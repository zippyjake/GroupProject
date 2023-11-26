package com.example.groupproject;

//here we create a public class for each color as well as each color having its
//own description on what the color should look like.
public class ColorInfo {

    private String black = "Introducing the epitome of sleek sophistication and timeless elegance: the Black Panther of " +
            "automobiles. This car isn't just a mode of transportation; it's a statement, an embodiment of sheer opulence " +
            "and commanding presence on the road.\n" + "\n" +
            "Immaculately draped in a lustrous black hue, this vehicle exudes an aura of mystery," +
            " captivating all with its enigmatic allure. Its glossy exterior reflects the world around it" +
            ", mirroring the urban landscape in a dance of shadows and light, embodying a symphony of sophistication " +
            "and power.\n";

    private String silver = "Behold the sleek embodiment of elegance: the Silver Streak. This automotive marvel gleams" +
            " under the sun, its silver hue cascading like liquid metal along its sinuous curves. As light dances upon " +
            "its surface, it creates an ethereal aura, transforming every drive into a mesmerizing journey.\n" + "\n" +
            "Crafted with precision and finesse, this car is more than just a mode of transportation; it's a statement. " +
            "The silver exterior exudes sophistication, drawing gazes and turning heads at every intersection. " +
            "Its metallic sheen reflects the world around it, embracing the surroundings with an understated allure.";

    private String red = "Introducing the epitome of automotive allure: the stunning Red Pearl. This captivating car " +
            "isn't just a vehicle; it's a statement, a fusion of style and sophistication that sets the roads ablaze " +
            "with its fiery red hue.\n" + "\n" +
            "From its sleek curves to its dynamic silhouette, every inch of this automotive marvel exudes elegance and " +
            "charisma. The vibrant red exterior effortlessly commands attention, turning heads and igniting admiration " +
            "wherever it roams.";

    private String blue = "Behold the epitome of sophistication and style on wheels – a magnificent automotive " +
            "masterpiece in an enchanting shade of blue. This car is a symphony of elegance, effortlessly blending " +
            "sleek contours with an aura of sheer opulence.\n" + "\n" +
            "Its mesmerizing blue hue captures the essence of tranquility, reminiscent of an endless sky meeting the " +
            "vastness of the ocean. As the sunlight dances upon its flawless exterior, every curve and line exudes a" +
            " captivating allure, drawing attention like a masterpiece on display.";

    private String green = "Behold the pulsating embodiment of innovation and style: the car draped in the electrifying " +
            "hue of green, an ode to modernity and dynamism. Its sleek, aerodynamic silhouette slices through the air," +
            " an epitome of automotive artistry.\n" + "\n" +
            "As sunlight kisses its metallic surface, the car radiates an unparalleled brilliance, commanding attention " +
            "at every turn. The chromatic spectacle of electric green dances in harmony with the car's contours, " +
            "accentuating its sporty essence and evoking a sense of forward motion even while at rest.";

    public ColorInfo() {}

    public String getBlack() {
        return black;
    }

    public String getBlue() {
        return blue;
    }

    public String getGreen() {
        return green;
    }

    public String getRed() {
        return red;
    }

    public String getSilver() {
        return silver;
    }

}
