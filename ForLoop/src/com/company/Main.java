package com.company;

public class Main {

    public static void main(String[] args) {

        for(int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

//        for(int i=8; i>1; i--) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
//        }

        int count = 0;
        for (int num=50; num<=100; num++) {
            if (isPrime(num)) {
                count ++;
                System.out.println(count + ".: " + num);
                if (count ==9) {
                    break;
                }
            }
        }

        //challenge

        int count2 = 0;
        int sum = 0;
        for(int num=1; num<= 1000; num++) {
            if((num % 3 == 0) && (num % 5 == 0)) {
                count2 ++;
                System.out.println("Number " + count2 + ": " + num);
                sum += num;
                if(count2 == 5) {
                    break;
                }
            }
        }
        System.out.println("The sum of them is: " + sum);
    }


    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }
        for (int i=2; i<=(long)Math.sqrt(n); i++) {
            if(n % i ==0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
