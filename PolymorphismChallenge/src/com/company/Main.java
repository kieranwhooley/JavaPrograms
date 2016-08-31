package com.company;

class Car {
    private boolean engine;
    private int numberOfWheels;
    private String name;
    private int numberOfCylinders;

    public Car(String name, int numberOfCylinders) {
        this.engine = true;
        this.numberOfWheels = 4;
        this.name = name;
        this.numberOfCylinders = numberOfCylinders;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " Unknown car start";
    }

    public String accelerate() {
        return "Unknown car acceleration";
    }

    public String brake() {
        return "Unknown car braking";
    }

    public boolean isEngine() {
        return engine;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }
}

class Tesla extends Car {
    public Tesla(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }

    public String startEngine() {
        return "Tesla started using electricity";
    }

    public String accelerate() {
        return "Tesla speeds up thanks to the sun";
    }

    public String brake() {
        return "Tesla braking due to lack of sunlight/electricity";
    }
}

class Canyonero extends Car {
    public Canyonero(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }

    public String startEngine() {
        return "Canyonero starts with a roar";
    }

    public String accelerate() {
        return "Squirrel-squashing, deer-smacking driving machine accelerates";
    }

    public String brake() {
        return "Canyonero slows down for no man";
    }
}

class UnknownCar extends Car {
    public UnknownCar(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }
}
public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base Car", 1);
        System.out.println(car.startEngine());

        UnknownCar something = new UnknownCar("Something eastern European", 1);
        System.out.println(something.getName() + "\n" + something.accelerate());

        Car modelX = new Tesla("Model-X", 8);
        System.out.println(modelX.getName() + "\n" + modelX.brake() + " \nNumber of wheels: " + modelX.getNumberOfWheels());

        Canyonero canyonero = new Canyonero("Canyonero", 200);
        System.out.println("Next car: " + canyonero.getName() + "\n" + canyonero.accelerate() + " with " + canyonero.getNumberOfCylinders() + " cylinders");

    }
}
