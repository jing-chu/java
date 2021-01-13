package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tom", 500);
        System.out.println("New score is: " + newScore);
        calculateScore(900);
        calculateScore();

        calcFeetAndInchesToCentimeters(6, 10);
        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player" + playerName + " scored " + score + " points");
        return score * 1000;
    }

    //Method Overloading: same name and different parameters
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player name, so player score");
        return 0;
    }

    //exercise of method overloading
    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet < 0 || inches  < 0 || inches > 12) {
            System.out.println("Invalid inches or feet");
            return -1;
        }
        double totalInches = feet * 12 + inches;
        double cm = totalInches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches is: " + cm + " centimeters");
        return cm;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int)inches / 12;
        double remaining = inches % 12;
        double cm = inches * 2.54;
        System.out.println(inches + " inches equal to " + feet + " feet, " + remaining + " inches");
        return calcFeetAndInchesToCentimeters(feet, remaining);
    }



}
