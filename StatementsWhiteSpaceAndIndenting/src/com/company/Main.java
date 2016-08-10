package com.company;

public class Main {

    public static void main(String[] args) {
        int myVariable = 49;
        myVariable++;
        System.out.println(myVariable);
        System.out.println("This is " +
                "another "
        + "statement");//multiline statement

        int anotherVariable = 5; anotherVariable--; //two statements on one line
        System.out.println(anotherVariable);

        if (myVariable == 50) {
            //indented
            System.out.println("Printed");
        }
    }
}
