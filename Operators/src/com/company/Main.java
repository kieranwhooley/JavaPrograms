package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;
        result -= 1;
        System.out.println("Previous Result - 1 = " + result);

        previousResult = result;
        result *= 10;
        System.out.println("Previous Result * 10 = " + result);

        previousResult = result;
        result /= 5;
        System.out.println("Previous Result \\ 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println("Previous Result remainder divided by 3 = " + result);

        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        --result;
        System.out.println(result);
        ++result;
        System.out.println(result);

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("It is not an alien");

        int topScore = 80;
        if (topScore == 80)
            System.out.println("You got the top score!");

        int secondScore = 60;
        if ((topScore > secondScore) && (topScore < 100))
            System.out.println("Greater than second score but less than 100");

        if ((topScore > 90) || (secondScore <= 90))
            System.out.println("One of these is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("True");
        //using one = in the evaluation assigns a new value, this may cause issues so make sure ==
        boolean isCar = false;
        if (isCar)
            System.out.println("Wrong");
        //ternary operator
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");
        double d = 2500;
        double c = 2500 % 40;
        System.out.println(c);
        //CHALLENGE
        double myDouble = 20;
        double myOtherDouble = 80;
        double calculation = (myDouble + myOtherDouble) * 25;
        System.out.println(calculation);
        double remainder = calculation % 40;
        System.out.println(remainder);
        if (remainder <= 20)
            System.out.println("Total was over the limit");



    }
}
