package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Diesel", "Red", 4, 4, 2, 3, "V8");
        car.move(10);
        car.steering("North");
        car.changeGears(3);
        car.changeSpeed(20, -20);
        car.changeSpeed(20, 30, 10);

        Tesla tesla = new Tesla("Electricity", "Red", 4, 4, 4, 5, "Electric", "Convertible", 125);
        tesla.changeSpeed(20, 10, 10);
        tesla.weeklyRechargeRate(125);
        tesla.changeGears(5);
        tesla.steering("West");
        tesla.getColour();
    }
}
