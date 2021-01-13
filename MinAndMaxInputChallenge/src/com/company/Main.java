package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);  // first new a Scanner and close it
        int maxNum = 0;
        int minNum = Integer.MAX_VALUE;
        while(true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();   //check input first


            if(hasNextInt) { // only input valid
                int num = scanner.nextInt();  // set input to num
                if (num > maxNum) {
                    maxNum = num;
                    System.out.println("max: " + maxNum);
                } else if (num < minNum) {
                    minNum = num;
                    System.out.println("min: " + minNum);
                }
            } else {
                System.out.println("Minimum Number is: " + minNum);
                System.out.println("Maximum Number is: " + maxNum);
                break;
            }
            scanner.nextLine();    // start another enter
        }

        scanner.close();
    }
}
