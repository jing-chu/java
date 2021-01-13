package com.company;

public class Vehicle {
    private String type;
    private String engine;
    private int doors;
    private int seats;

    public Vehicle(String type, String engine, int doors, int seats) {
        this.type = type;
        this.engine = engine;
        this.doors = doors;
        this.seats = seats;
    }

    public void speed (int speed) {
        System.out.println("vehicle.speed(): " + speed );
    }
}
