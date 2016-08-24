package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5); //create dimensions object to pass to Case
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));//pass resolution object directly

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        /*thePC.getMonitors().drawPixelAt(1500, 1200, "Red");//change getters in PC to public to access
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();//accessing methods in case/motherboard/monitor objects from PC

        Not working anymore as getters no longer in PC but instead going to Case/Monitor/Motherboard
        */

        thePC.powerUp();

        //CHALLENGE (Bedroom, Heater, Window, Wardrobe)
        Bedroom myRoom = new Bedroom("Single", new Heater("Illumina", "Electric"),
                new Window(new Dimensions(15, 10, 5), "Double Glazed", "Frosted"),
                new Wardrobe("Wood", new Dimensions(250, 125, 75)));

        myRoom.OpenOrCloseWindow(true);
        myRoom.getHeater().turnOn(true);
        myRoom.setTemperatureInRoom(22.5);
        myRoom.OpenOrCloseWindow(false);



    }
}
