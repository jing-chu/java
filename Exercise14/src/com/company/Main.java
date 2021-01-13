package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(1,-100));
        System.out.println(sumOdd(100,1000));
        System.out.println(sumOdd(122,100));
    }

    public static boolean isOdd(int num) {
        if (num <= 0) {
            return false;
        }
        return num % 2 != 0;
    }

    public static int sumOdd (int start, int end) {
        if (end < start || start <= 0) {
            return -1;
        }
        int sum = 0;
        for (int i=start; i<=end; i++) {
            if(isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
