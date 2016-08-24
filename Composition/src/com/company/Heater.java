package com.company;

/**
 * Created on 24/08/2016.
 */
public class Heater {

    private String manufacturer;
    private String powerSupply;

    public Heater(String manufacturer, String powerSupply) {
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void turnOn(boolean TurnOn) {
        if(TurnOn) {
            System.out.println("Heater is now turned: On");
        } else {
            System.out.println("Heater is: Off");
        }
    }

    public void heaterTempurature(double temperature) {
        System.out.println("Heater is set to: " + temperature + " degrees Celsius");
    }

}
