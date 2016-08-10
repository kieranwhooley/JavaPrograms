package com.company;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
	    int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("MyTotal Ints " + myTotal);
        // byte has a width of 8
        //System.out.println(myMaxValue);
        byte myByteValue = -128;
        byte myBigByte = 127;
        byte myByteTotal = (byte) (myByteValue/2);//converts automatically to int, casted to byte
        System.out.println("MyTotal Bytes " + myByteTotal);
        //short has a width of 16
        short myShort = 32767;
        short myNewValue =(short) (myShort/2);
        System.out.println(myNewValue);
        //long has width of 64
        long myLongValue = 100L;

        //CHALLENGE
        byte aByte = 10;
        int aInt = 50;
        short aShort = 20;
        long aLong = 50000L + 10L * (aByte + aInt + aShort);//automatically converted to int accepted by long
        short shortTotal = (short) (1000 + 10 * (aByte + aInt + aShort));//casted
        System.out.println("Long total = " + aLong);
        System.out.println(shortTotal);
    }
}
