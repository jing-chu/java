package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle circle = new Circle(3.75);
        System.out.println("Circle.radius: " + circle.getRadius());
        System.out.println("Circle.area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder.getRadius: " + cylinder.getRadius());
        System.out.println("Cylinder.getHeight: " + cylinder.getHeight());
        System.out.println("Cylinder.gerArea: " + cylinder.getArea());
        System.out.println("Cylinder.getVolume: " + cylinder.getVolume());
    }
}
