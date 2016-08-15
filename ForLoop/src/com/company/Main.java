package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calculated interest = €" + calculateInterest(10000, 2.0));

        for ( int i = 0; i <= 5; i++){
            System.out.println("Loop " + i + " Hello");
        }

        //CHALLENGE
        for (int j = 2; j < 9; j++){
            System.out.println(j + "% = €" + String.format("%.2f",calculateInterest(10000, j)));
        }
        System.out.println("************");
        //CHALLENGE
        for (int j = 8; j > 1; j--){
            System.out.println(j + "% = €" + String.format("%.2f",calculateInterest(10000, j)));
        }
        //CHALLENGE
        int counter = 0;
        for (int k = 10; k < 20; k++){
            if (isPrime(k) && counter < 3){
                System.out.println(k + " is a prime");
                counter++;
            }
        }

        //FAT CHALLENGE
        int count = 0;
        for (int i = 20; i < 50; i++){
            if (isPrime(i)){
                count++;
                System.out.println(i + " is a prime");
                if (count == 3){
                    System.out.println("Exiting");
                    break;
                }
            }
        }
    }

    public static boolean isPrime (int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static double calculateInterest (double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
