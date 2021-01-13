package com.company;

import java.util.Scanner;

public class SortedArray {
    public static int[] getInteger(int num) {
        Scanner scanner = new Scanner(System.in);
        int[] myIntArr = new int[num];
        System.out.println("Enter " + num + " Integers: \r");
        for(int i=0; i<myIntArr.length; i++){
            myIntArr[i] = scanner.nextInt();
        }
        return myIntArr;
    }

    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }

   public static int[] sortIntegers(int[] arr) {
        int temp = 0;
        for(int i=0; i< arr.length; i++) {
            for(int j=i+1; j< arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        return arr;
   }




}
