package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        while (counter < 11) {
            System.out.println("Enter number #" + counter + ": ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                counter++;
                int number = scanner.nextInt();
                sum += number;
            } else {
                System.out.println("Number is invalid.");
            }
            scanner.nextLine();
        }
        System.out.println("The sum is: " + sum);
        scanner.close();

    }
}
