package com.company;

/**
 * Created on 22/08/2016.
 */
public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private  void rest() {

    }

    private void moveMuscles() {
        System.out.println("moveMuscles() called");
    }

    private void moveBackFin() {
        System.out.println("moveBackFin() called");
    }

    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
        //System.out.println("Swimming at speed of " + speed);
    }
}
