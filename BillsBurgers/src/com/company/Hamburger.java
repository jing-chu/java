package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1 (String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.println("Your addition No.1 is: " + this.addition1Name + " with " + this. addition1Price + " dollars.");
    }

    public void addHamburgerAddition2 (String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.println("Your addition No.2 is: " + this.addition2Name + " with " + this.addition2Price + " dollars.");
    }

    public void addHamburgerAddition3 (String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.println("Your addition No.3 is: " + this.addition3Name + " with " + this.addition3Price + " dollars.");
    }

    public void addHamburgerAddition4 (String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.println("Your addition No.4 is: " + this.addition4Name + " with " + this.addition4Price + " dollars.");
    }

    public double itemizehamburger() {
        double totalPrice = this.price;
        if (this.addition1Name != null) {
            totalPrice += this.addition1Price;
        }
        if (this.addition2Name != null) {
            totalPrice += this.addition2Price;
        }
        if (this.addition3Name != null) {
            totalPrice += this.addition3Price;
        }
        if (this.addition4Name != null) {
            totalPrice += this.addition4Price;
        }
        System.out.println(this.name + " on a " + this.breadRollType + " with " + this.meat + " , price is: " + this.price);
        return totalPrice;

    }
}
