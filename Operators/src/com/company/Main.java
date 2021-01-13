package com.company;

public class Main {

    public static void main(String[] args) {


        //String is a class
        String myString = "This is a string";   //capital S
        myString = myString + ", and this is more.";
        myString = myString + " \u00A9 2020";
        System.out.println(myString);

        String numString = "205.55";
        int num = 50;
        String sumString1 = numString + num; // Sum is: 205.5550
        System.out.println("Sum is: " + sumString1);

        // summary of operators
        //Java operator precedence table

        boolean isAlien = false;   // assignment operator
        if (isAlien == false)    //equal to operator
            System.out.println("It is not a alien!");

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less then 100");
        }

        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("Either or both of the conditions are true.");
        }

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;   //Ternary operator
        if (wasCar) {
            System.out.println("wasCar is true.");
        }

        // challenge
        double num1 = 20.00d;
        double num2 = 80.00d;
        double sum = (num1 + num2) * 100;
        double remainder = sum % 40;
        boolean isZero = remainder == 0 ? true : false;
        System.out.println("Is remainder 0 ?: " + isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }

    }
}
