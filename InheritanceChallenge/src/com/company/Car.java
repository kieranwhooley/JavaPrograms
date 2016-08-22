package com.company;

/**
 * Created on 22/08/2016.
 */
public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int windows;
    private String engineType;

    public Car(String propelledBy, String colour, int seats, int wheels, int doors, int windows, String engineType) {
        super(propelledBy, colour, seats);
        this.wheels = wheels;
        this.doors = doors;
        this.windows = windows;
        this.engineType = engineType;
    }

    @Override
    public void move(int speed) {
        //super.move(speed);
        System.out.println("Car.move() called. Car moving at speed " + speed);
    }

    public void changeGears(int gear) {
        System.out.println("Car.changeGears() called\nChanged to gear " + gear);
    }

    public void changeSpeed(int speed, int changeInSpeed, int boost) {
        //super.changeSpeed(speed, newSpeed);
        System.out.println("Car.changeSpeed() called\nCar was going at speed: " + speed + "\nCar speed changed to: " + (speed + changeInSpeed + boost) + " including boost of: " + boost);
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public String getEngineType() {
        return engineType;
    }
}
