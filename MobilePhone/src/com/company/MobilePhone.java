package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (this.findContact(contact) == -1) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact contactOld, Contact contactNew) {
        if(myContacts.contains(contactOld)){
            myContacts.set(myContacts.indexOf(contactOld), contactNew);
            return this.findContact(contactNew)>= 0;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return this.findContact(contact) < 0;
        }
        return false;
    }

    private int findContact(Contact contact) {
        for (Contact i: myContacts) {
            if (i.getName().equals(contact.getName())) {
                //System.out.println("findContacts: " + myContacts.indexOf(i));
                return myContacts.indexOf(i);
            }
        }
        return -1;
    }

    private int findContact(String name) {
       for (Contact i : myContacts) {
           if (i.getName().equals(name)) {
               return myContacts.indexOf(i);
           }
       }
       return -1;
    }

    public Contact queryContact(String name) {

        if (this.findContact(name) >=0) {

            return myContacts.get(this.findContact(name));
        } else {
            return null;
        }
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1) +
                    ". " + myContacts.get(i).getName() +
                    " -> " + myContacts.get(i).getPhoneNumber());
        }
    }


}
