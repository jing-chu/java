package com.company;

import java.sql.SQLOutput;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";   //const value

    public static void main(String[] args) {
        System.out.println(getDurationString(60, 0));
        System.out.println(getDurationString(9645));
        System.out.println(getDurationString(1698,69));
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        int remainingM = minutes % 60;
        return hours +  "h " + remainingM + "m " + seconds + "s" ;
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingM = seconds % 60;
        System.out.println(seconds + " are: " + minutes + "m, " + remainingM + "s");
        return getDurationString(minutes, remainingM);
    }

}
