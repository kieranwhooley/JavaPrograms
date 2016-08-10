package com.company;

public class Main {

    public static void main(String[] args) {
        //width int 32 = 4 bytes
        int myIntValue = 5/3;
        //width float 32 = 4 bytes
        float myFloatValue = 5f/3f;
        //width double 32 = 8 bytes
        double myDoubleValue = 5d/3d;

        System.out.println("myInValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //CHALLENGE

        double pounds = 200;
        double poundsToKG = pounds * 0.45359237;
        System.out.println("Pounds entered: " + pounds + "\n" + "Converted to KG: " + poundsToKG);
        //90.718474
        double pi = 3_000_000.141_007;
    }
}
