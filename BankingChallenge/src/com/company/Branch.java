package com.company;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double transaction) {
        if (this.findCustomer(customerName)==null) {
            Customer newCustomer = new Customer(customerName, transaction);
            customers.add(newCustomer);
            return true;
        } else {
            System.out.println(customerName + " already exist.");
            return false;
        }

    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        if (this.findCustomer(customerName)==null) {
            System.out.println("There is no customer named: " + customerName);
            return false;
        } else {
            for(Customer i : customers) {
                if (i.getName().equals(customerName)) {
                    i.addTransaction(transaction);
                    return true;
                }
            }
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer i : customers) {
            if (i.getName().equals(customerName)) {
                return i;
            }
        }
        return null;
    }

}
