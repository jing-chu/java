package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        float myFloatValue1 = 4;
        float myFloatValue2 = 5.25f;
        float myFloatValue3 = (float)6.25;
        double myDoubleValue1 = 7;
        double myDoubleValue2 = 7.25;
        double myDoubleValue3 = 8.25d;
        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;
        System.out.println("Int = " + myIntValue);
        System.out.println("Float =" + myFloatValue);
        System.out.println("Double =" + myDoubleValue);

        double myPounds = 5;
        double myKg = myPounds * 0.45359237;
        System.out.println("Kilograms = " + myKg);
    }
}
