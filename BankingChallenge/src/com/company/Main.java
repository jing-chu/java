package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("ING");

        bank.addBranch("Heverlee");
        bank.addBranch("Leuven");

        bank.addCustomer("Heverlee", "Tim",50.09);
        bank.addCustomer("Heverlee", "Mike",5410.09);
        bank.addCustomer("Heverlee", "Jane",87.33);

        bank.addCustomerTransaction("Heverlee", "Tim", 987.21);
        bank.addCustomerTransaction("Heverlee", "Tim", 27.65);
        bank.addCustomerTransaction("Heverlee", "Mike", 2000.00);

        bank.listCustomers("Heverlee", true);

        System.out.println(bank.addCustomer("Heverlee","Tim",90.0));
        System.out.println(bank.addCustomerTransaction("Heverlee", "Nick", 987.21));



    }
}
