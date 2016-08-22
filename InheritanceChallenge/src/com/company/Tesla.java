package com.company;

/**
 * Created on 22/08/2016.
 */
public class Tesla extends Car {

    private String roofType;
    private int electricityUsage;

    public Tesla(String propelledBy, String colour, int seats, int wheels, int doors, int windows, String engineType, String roofType, int electricityUsage) {
        super(propelledBy, colour, seats, wheels, doors, windows, engineType);
        this.roofType = roofType;
        this.electricityUsage = electricityUsage;
    }

    public void weeklyRechargeRate(int rechargeMileage){
        System.out.println("Tesla.rechargeRate() called. Recharge rate is every: " + rechargeMileage + " miles");
    }

    @Override
    public void changeSpeed(int speed, int changeInSpeed, int boost) {
        //super.changeSpeed(speed, changeInSpeed, boost);
        System.out.println("Tesla.changeSpeed() called\nOld speed: + " + speed +
                "\nNew speed: " + changeInSpeed + "\nTesla speed boost: " + boost +
                "\nTotal speed plus boost: " + ((boost * 2) + (speed + changeInSpeed)));
    }

    public String getRoofType() {
        return roofType;
    }

    public int getElectricityUsage() {
        return electricityUsage;
    }
}
