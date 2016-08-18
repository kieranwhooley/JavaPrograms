package com.company;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();
        //System.out.println(porsche.getModel()); //null default state
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

    }
}
