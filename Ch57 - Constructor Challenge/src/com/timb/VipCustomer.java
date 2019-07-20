package com.timb;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    //CONSTRUCTOR1 - All defaults
    public VipCustomer() {
        this("Default Name", 5000, "default email");
    }

    //CONSTRUCTOR2 - 2 incoming and email default
    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "Default Email");
    }

    //CONSTRUCTOR3 - Take in all values
    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
