package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {


    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    public static int[] readElements(int num) {
        Scanner scanner = new Scanner(System.in);
        int[] intArr = new int[num];
        for ( int i = 0; i < num; i ++) {
            System.out.println("Enter element: ");
            intArr[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("array is: " + Arrays.toString(intArr));
        return intArr;
    }

    public static int findMin(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[0];
    }
}
