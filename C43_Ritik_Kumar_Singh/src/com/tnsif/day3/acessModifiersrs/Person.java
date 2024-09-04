package com.tnsif.day3.acessModifiersrs;

// File: package1/Person.jav

public class Person {
    // Public member: accessible from any other class
    public String name;

    // Protected member: accessible within the same package and subclasses
    protected int age;

    // Default (package-private) member: accessible only within the same package
    String address;

    // Private member: accessible only within this class
    private String ssn;

    // Public constructor
    public Person(String name, int age, String address, String ssn) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.ssn = ssn;
    }

    // Public method: accessible from any other class
    public void displayPublicInfo() {
        System.out.println("Name: " + name);
    }

    // Protected method: accessible within the same package and subclasses
    protected void displayProtectedInfo() {
        System.out.println("Age: " + age);
    }

    // Default method: accessible only within the same package
    void displayDefaultInfo() {
        System.out.println("Address: " + address);
    }

    // Private method: accessible only within this class
    private void displayPrivateInfo() {
        System.out.println("SSN: " + ssn);
    }

    // Public method to access private member
    public void showPrivateInfo() {
        displayPrivateInfo();
    }
}
