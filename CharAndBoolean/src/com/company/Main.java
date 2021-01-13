package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';   //16 bites
        char myUnicodeChar = '\u0044';   // unicode-table.com
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyRightChar = '\u00A9';
        System.out.println(myCopyRightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        
        boolean isCustomerOverTwentyOne = true;
    }
}
