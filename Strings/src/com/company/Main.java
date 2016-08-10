package com.company;

public class Main {

    public static void main(String[] args) {

        //byte
        //int
        //short
        //long
        //double
        //float
        //char
        //boolean
        //8 primitive types build into the language
        //String not a primitive type, its a class but like a 9th primitive type

        String myString = "This is a string";
        System.out.println("String = " + myString);
        myString = myString + " and this also";
        System.out.println(myString);
        myString = myString + " '\u00AE' +2015";
        System.out.println(myString);
        char a = '\u00C0';
        System.out.println(a);
        String numberString = "250.55";
        numberString += "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString + myInt);

        double doubleNumber = 127.4;
        System.out.println(lastString + doubleNumber);
    }
}
