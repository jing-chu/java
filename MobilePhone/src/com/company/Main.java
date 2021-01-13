package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MobilePhone myMobilePhone = new MobilePhone("1354899");
        //Contact contact1 = new Contact("Bob", "4561789");
       // myMobilePhone.addNewContact(contact1);
        //myMobilePhone.printContacts();
        myMobilePhone.addNewContact(Contact.createContact("Alice", "4567891"));
        myMobilePhone.addNewContact(Contact.createContact("Tom", "2359741"));
        myMobilePhone.addNewContact(Contact.createContact("Jane", "1569863"));
        myMobilePhone.printContacts();
        System.out.println(myMobilePhone.addNewContact(Contact.createContact("Jane", "1569863")));
        Contact contactJane = myMobilePhone.queryContact("Jane");
        System.out.println("Query result: Name= " + contactJane.getName() + ", phone= " +contactJane.getPhoneNumber());

    }
}
