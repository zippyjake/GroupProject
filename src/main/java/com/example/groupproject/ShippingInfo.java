package com.example.groupproject;

public class ShippingInfo {


    private String newBern = "Address: 3403 Dr. M.L.K. Jr Blvd, New Bern, NC 28562 \n" +
            "Phone Number: (252)560-2311 \n" +
            "Email: NewBernCapeFearCars@gmail.com";
    public double PriceNewBern = 100;
    private String Wilmington = "Address: 5725 Market St, Wilmington, NC 28405 \n" +
            "Phone Number: (919)757-3849 \n" +
            "Email: WilmingtionCapeFearCars@gmail.com";
    private double PriceWilmington = 50;
    private String Raleigh = "Address: 6005 Grove Church Rd suite b, Raleigh, NC 27612 \n" +
            "Phone Number: (919)-845-2321 \n" +
            "Email: RalieghCapeFearCars@gmail.com";
    private double PriceRaliegh = 250;
    private String Boone = "Address:  2015 Blowing Rock Rd, Boone, NC 28607 \n" +
            "Phone Number: (828) 414-9191 \n" +
            "Email: BooneCapeFearCars@gmail.com";
    private double PriceBoone = 450;
    private String GreensBoro = "Address: 3800 Burlington Rd, Greensboro, NC 27405 \n" +
            "Phone Number: (336)-874-9376 \n" +
            "Email: GreensBoroCapeFearCars@gmail.com";
    private double PriceGreensBoro = 300;
    private String Charlotte = "Address: 5555 Concord Pkwy S, Concord, NC 28027 \n" +
            "Phone Number: (704)-564-1239 \n" +
            "Email: CharlotteCapeFearCars@gmail.com";
    private double PriceCharlotte = 350;

    public ShippingInfo (){};

    public String getNewBern() {
        return newBern;
    }
    public double getPriceNewBern(){
        return PriceNewBern;
    }
    public String getWilmington() {
        return Wilmington;
    }
    public double getPriceWilmington(){
        return PriceWilmington;
    }

    public String getRaleigh() {
        return Raleigh;
    }
    public double getPriceRaleigh(){
        return PriceRaliegh;
    }

    public String getBoone() {
        return Boone;
    }

    public double getPriceBoone(){
        return PriceBoone;
    }

    public String getGreensBoro() {
        return GreensBoro;
    }
    public double getPriceGreensBoro(){
        return PriceGreensBoro;
    }

    public String getCharlotte() {
        return Charlotte;
    }
    public double getPriceCharlotte(){
        return PriceCharlotte;
    }

}
