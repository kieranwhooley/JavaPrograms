package com.company;

public class Main {

    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 4999;
          int levelCompleted = 5;
//        int bonus = 100;

        int highScore = calculateScore(true, 4999, levelCompleted, 100);
        System.out.println("Final score: " + highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("New high score: " + highScore);
        calculateScore(false, 5000, 2, 100);

        //displayHighScorePosition("Rudiger", 1);
        //displayHighScorePosition("Smith", 5);

        int positionValue = calculateHighScorePosition(1500);
        displayHighScorePosition("Rudiger", positionValue);
        positionValue = calculateHighScorePosition(900);
        displayHighScorePosition("Smith", positionValue);
        positionValue = calculateHighScorePosition(400);
        displayHighScorePosition("Jones", positionValue);
        positionValue = calculateHighScorePosition(50);
        displayHighScorePosition("Holly", positionValue);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            //System.out.println("Final score: " + finalScore);
            return finalScore;
        } //else {
        //System.out.println("Game wasn't over");
        return -1;
        //}
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get table position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000){
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
