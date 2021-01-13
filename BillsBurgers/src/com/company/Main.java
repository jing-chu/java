package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("basic", "Sausage", 3.56,"white");
        hamburger.addHamburgerAddition1("Onion", 0.27);
        hamburger.addHamburgerAddition2("egg", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.13);
        System.out.println("total price with additions is: " + hamburger.itemizehamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Onion", 50.53);
        System.out.println("Total price of Deluxe Burger is: " + deluxeBurger.itemizehamburger());

        HealthyBurger healthyBurger = new HealthyBurger("bacon", 5.67);
        healthyBurger.addHealthyAddition1("egg",5.43);
        healthyBurger.addHealthyAddition2("cucumber", 3.41);
        System.out.println("Total price of a healthy Burger is: " + healthyBurger.itemizehamburger());

    }
}
