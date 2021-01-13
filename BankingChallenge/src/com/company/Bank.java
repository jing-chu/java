package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(this.findBranch(branchName) ==null) {
            Branch newBranch = new Branch(branchName);
            branches.add(newBranch);
            return true;
        }
        System.out.println(branchName + " already exist.");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        if(this.findBranch(branchName) == null) {
            System.out.println("There is no branch: " + branchName);
            return false;
        } else {
            for (Branch b : branches) {
                if(b.getName().equals(branchName)){
                    return b.newCustomer(customerName,transaction);
                }
            }
        }
        return true;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if(this.findBranch(branchName) == null) {
            System.out.println("There is no branch: " + branchName);
            return false;
        } else {
            for (Branch b : branches) {
                if(b.getName().equals(branchName)){
                    return b.addCustomerTransaction(customerName, transaction);
                }
            }
        }
        return true;
    }

    private Branch findBranch(String branchName) {
        for(Branch i : branches) {
            if (i.getName().equals(branchName)) {
                return i;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {
        System.out.println("Customer details for branch " + branchName);
        if(this.findBranch(branchName) == null) {
            System.out.println("There is no branch: " + branchName);
            return false;
        }
        for (int i=0; i < branches.size(); i ++) {
            Branch branch = branches.get(i);
            if(printTransaction) {
                for (int j=0; j < branch.getCustomers().size(); j++) {
                    Customer customer = branch.getCustomers().get(j);
                    System.out.println("Customer: " + customer.getName() + "[" + (j+1) + "]");
                    System.out.println("Transactions");
                    for(int c=0; c < customer.getTransactions().size(); c++) {
                        System.out.println("[" + (c+1) + "] Amount " + customer.getTransactions().get(c));
                    }
                }
            } else {
                for(int j=0; j < branch.getCustomers().size(); j++) {
                    Customer customer = branch.getCustomers().get(j);
                    System.out.println("Customer: " + customer.getName() + "[" + (j+1) + "]");
                }
            }
        }
        return true;
    }
}
