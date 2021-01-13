package com.company;

public class Main {

    public static void main(String[] args) {

        int num = MinimumElement.readInteger();
        int[] arr = MinimumElement.readElements(num);
        System.out.println(MinimumElement.findMin(arr));

    }
}
