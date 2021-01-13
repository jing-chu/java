package com.company;

import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rec.getWidth: " + rectangle.getWidth());
        System.out.println("Rec.getLength: " + rectangle.getLength());
        System.out.println("rec.getArea: " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("Cuboid.getWidth: " + cuboid.getWidth());
        System.out.println("Cuboid.getLength: " + cuboid.getLength());
        System.out.println("cuboid.getArea: " + cuboid.getArea());
        System.out.println("Cuboid.getHeight:" + cuboid.getHeight());
        System.out.println("Cuboid.getVolume: " + cuboid.getVolume());
    }
}
