package com.company;

public class Main {

    public static void main(String[] args) {

        /*int count = 0; //may never execute
        while(count != 5){
            System.out.println("Count value is: " + count);
            count++;
        }

        *//*for(int i = 0; i < 5; i++){
            System.out.println("Count value is: " + i);
        }*//*

        count = 1; //may never execute
        while(true){
            if(count == 5){
                break;
            }
            System.out.println("Count value is: " + count);
            count++;
        }

        count = 5; //always executes at least once
        do{
            System.out.println("Coutn value is: " + count);
            count++;

            if (count > 100) {
                break;
            }
        } while(count != 5);*/

        //CHALLENGE
        /*int number = 1;
        while (number < 20){
            boolean oddOrEven = isEvenNumber(number);
            System.out.println("Is " + number + " even?: " + oddOrEven);
            number++;
        }*/

        int number = 1;
        int evens = 0;
        int finishNumber = 20;
        //while ((number <= finishNumber) && (evens < 5)){
        while ((number <= finishNumber)){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("Even number: " + number);
            number++;
            evens++;
            if (evens >= 5){
                break;
            }
        }
        System.out.println("Amount of even numbers: " + evens);



    }

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
}
