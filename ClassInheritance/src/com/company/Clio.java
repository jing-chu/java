package com.company;

public class Clio extends Car{
    private String color;
    private boolean parkingCamera;

    public Clio(String engine, int doors,
                int seats, boolean gears, String name,
                String color, boolean parkingCamera) {
        super(engine, doors, seats, gears, name);
        this.color = color;
        this.parkingCamera = parkingCamera;
    }

    public void changeGears() {
        System.out.println("Clio.changeGears is called.");
    }
}
