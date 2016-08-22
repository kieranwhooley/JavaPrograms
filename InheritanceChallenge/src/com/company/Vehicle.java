package com.company;

/**
 * Created on 22/08/2016.
 */
public class Vehicle {

    private String propelledBy;
    private String colour;
    private int seats;

    public Vehicle(String propelledBy, String colour, int seats) {
        this.propelledBy = propelledBy;
        this.colour = colour;
        this.seats = seats;
    }

    public void move(int speed) {
        System.out.println("Vehicle.move() called. Moving at speed " + speed);
    }

    public void changeSpeed(int speed, int newSpeed) {
        System.out.println("Vehicle.changeSpeed() called.\nOld speed was: " + speed + "\nNew speed is: " + (speed + newSpeed));
    }

    public void steering(String direction){
        System.out.println("Vehicle.steering() called. Steering towards: " + direction);
    }

    public String getPropelledBy() {
        return propelledBy;
    }

    public String getColour() {
        System.out.println(colour);
        return colour;
    }

    public int getSeats() {
        return seats;
    }
}
