package com.company;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy Burger",meat, price, "brown bread");
    }

    public void addHealthyAddition1 (String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println("A healthy addition is added: " + this.healthyExtra1Name + " with " + this.healthyExtra1Price + " dollars.");
    }

    public void addHealthyAddition2 (String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.println("A healthy addition is added: " + this.healthyExtra2Name + " with " + this.healthyExtra2Price + " dollars.");
    }

    @Override
    public double itemizehamburger() {
        double totalPrice = super.itemizehamburger();
        if (healthyExtra1Name != null) {
            totalPrice += healthyExtra1Price;
        }
        if (healthyExtra2Name != null) {
            totalPrice += healthyExtra2Price;
        }
        return totalPrice;
    }
}
