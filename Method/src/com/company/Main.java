package com.company;

public class Main {

    public static void main(String[] args) {   //define the main method: the entry point of java application

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was: " + highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was: " + highScore);

        int positionOnHighScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Jenny", positionOnHighScore);

        positionOnHighScore = calculateHighScorePosition(900);
        displayHighScorePosition("Tom", positionOnHighScore);

        positionOnHighScore = calculateHighScorePosition(400);
        displayHighScorePosition("Monkey", positionOnHighScore);

        positionOnHighScore = calculateHighScorePosition(50);
        displayHighScorePosition("baby", positionOnHighScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void  displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//
//        return 4;

        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }


}


