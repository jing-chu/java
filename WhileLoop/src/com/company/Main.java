package com.company;

public class Main {

    public static void main(String[] args) {

        int num = 4;
        int finishNumber = 20;
        int count = 0;
        int sum = 0;

        while (num <= finishNumber) {
            num ++;
            if(!isEvenNumber((num))) {
                continue;    //go back to the beginning of the loop
            }
            System.out.println("Even number: " + num);
            count ++;
            sum += num;
            if (count == 5) {
                System.out.println("Sum is: " + sum);
                break;    //exit the loop
            }
        }

        System.out.println("--------------------------------");

        System.out.println(sumDigits(1259));
    }

    public static boolean isEvenNumber(int x) {
        if ( x % 2 == 0 ) {
            return true;
        }
        return false;
    }

    public static int sumDigits (int num) {
        if (num < 10) {
            return -1;
        }

//        int digit = 0;
//        while (true) {
//           digit += num % 10;
//           num = num / 10;
//           if (num % 10 == 0) {
//               break;
//           }
//        }
//        return digit;

        int sum = 0;
        while (num > 0) {
            int digit = num % 10;  //extract the least-significant digit
            sum += digit;
            num /= 10;   //drop the least-significant digit
        }
        return sum;
    }
}
