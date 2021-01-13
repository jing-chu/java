package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);

    }

    private static void reverse(int[] arr) {
        System.out.println("Array = " + Arrays.toString(arr));
        int[] copiedArr = arr.clone();
        int temp = 0;
        for (int i = 0; i < arr.length; i ++) {
            temp = copiedArr[arr.length-1-i];
            copiedArr[arr.length-1-i] = arr[i]; 
            arr[i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(copiedArr));
    }
}
