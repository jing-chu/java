package com.company;

public class Car extends Vehicle {
    private boolean gears;
    private String name;

    public Car(String engine, int doors, int seats, boolean gears, String name) {
        super("car", engine, doors, seats);
        this.gears = gears;
        this.name = name;
    }

    public void increaseSpeed (int num) {
        System.out.println("Car. increaseSpeed(). The speed increase: " + num);
    }

    public void decreaseSpeed(int num) {
        System.out.println("Car.decreaseSpeed(). The speed decrease: " + num);
    }

}
