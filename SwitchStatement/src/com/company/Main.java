package com.company;

public class Main {

    public static void main(String[] args) {

        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;   //break the switch block

            case 2:
                System.out.println("value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("value was " + switchValue);
                break;

            default:
                System.out.println("value was not 1 to 5");
                break;
        }

        char switchChar = 'A';

        switch (switchChar) {
            case 'A':
                System.out.println("value was A");
                break;

            case 'B':
                System.out.println("value was B");
                break;

            case 'C': case 'D': case 'E':
                System.out.println("value was " + switchValue);
                break;

            default:
                System.out.println("value was not A to E");
                break;
        }
    }
}
