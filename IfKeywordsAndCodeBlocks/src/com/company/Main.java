package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4999;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000){
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else{
//            System.out.println("Your score was greater than 5000");
//        }

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final score: " + finalScore);
        }

        //int savedFinalScore = finalScore + 1; //finalScore is a variable created in code block so not accessible

        //CHALLENGE
//        int score2 = 10_000;
//        int levelCompleted2 = 8;
//        int bonus2 = 200;
//        if (gameOver){
//            int finalScore = score2 + (levelCompleted2 * bonus2);
//            System.out.println("Final score: " + finalScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final score: " + finalScore);
        }
    }
}
