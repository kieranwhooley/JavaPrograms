package com.company;

public class Main {

    public static void main(String[] args) {

//        int newScore = calculateScore("Rudiger", 500);
//        System.out.println( "New score is: " + newScore);
//
//        calculateScore(100);
//        calculateScore();
        double convertedLength = calcFeetAndInchesToCentimetres(1, 4);
        System.out.println(convertedLength + "cm");
        convertedLength = calcFeetAndInchesToCentimetres(5, 8);
        System.out.println(convertedLength + "cm");

        double inchesOnly = calcFeetAndInchesToCentimetres(68);
        System.out.println(inchesOnly + "cm");
        inchesOnly = calcFeetAndInchesToCentimetres(6, 0);
        System.out.println(inchesOnly + "cm");
        inchesOnly = calcFeetAndInchesToCentimetres(-10);
        if (inchesOnly < 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(inchesOnly + "cm");
        }
        inchesOnly = calcFeetAndInchesToCentimetres(157);
        System.out.println(inchesOnly + "cm");
        inchesOnly = calcFeetAndInchesToCentimetres(13, 1);
    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inches){
        if((feet < 0) || ((inches < 0) || (inches >= 12))){
            System.out.println("Invalid values entered");
            return -1;
        } else {
            double cm = (((feet *  12) * 2.54) + (inches * 2.54));
            System.out.println(feet + " feet and " + inches + " inches = " + cm + "cm");
            return cm;
        }

    }

    public static double calcFeetAndInchesToCentimetres(double inches){
        if (inches < 0){
            return -1;
        } else {
            //double inchesValueRemaining = (int) inches / 12;
            double inchesValueRemaining = (int) inches % 12;
            double feetValue = (inches - inchesValueRemaining) / 12;
            System.out.println(inches + " inches = " + feetValue + " feet and " + inchesValueRemaining + " inches");
            double feetAndInchesInCM = calcFeetAndInchesToCentimetres(feetValue, inchesValueRemaining);
            return feetAndInchesInCM;
        }
    }

//    public static int calculateScore (String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore (int score) {
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore () {
//        System.out.println("No player or score supplied");
//        return 0;
//    }
}
