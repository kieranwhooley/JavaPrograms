package com.company;

public class Main {

    public static void main(String[] args){

        /*int value = 2;
        if (value == 1){
            System.out.println("One");
        } else if (value == 2){
            System.out.println("Two");
        } else {
            System.out.println("Neither");
        }*/

        /*int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:case 4:case 5:
                System.out.println("Three, Four or Five");
                System.out.println("It was: " + switchValue);
                break;

            default:
                System.out.println("None of them");
        }*/

        //CHALLENGE

        char letter = 'C';

        /*switch(letter) {
            case 'A':
                System.out.println("A was entered");
                break;
            case 'B':
                System.out.println("B was entered");
                break;
            case 'C':
                System.out.println("C was entered");
                break;
            case 'D':
                System.out.println("D was entered");
                break;
            case 'E':
                System.out.println("E was entered");
                break;
            default:
                System.out.println("A, B, C, D or E was not entered");
                System.out.println("Entered value was " + letter);
                break;
        }*/

        switch(letter) {
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println(letter + " was entered");
                break;
            default:
                System.out.println("A, B, C, D or E was not entered");
                System.out.println("Entered value was " + letter);
                break;
        }

        String month = "JANUARY";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println(month + " entered");
                break;
            default:
                System.out.println("Not January");
                break;
        }
    }
}
