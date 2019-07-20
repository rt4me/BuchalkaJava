package com.timb;

public class Main {

    public static void main(String[] args) {
        VipCustomer alt1 = new VipCustomer();
        VipCustomer alt2 = new VipCustomer("Dave Second", 4000);
        VipCustomer alt3 = new VipCustomer("Julie Third", 25000, "Julie@gmail.com");

        //Alt1 lines
        System.out.println(alt1.getName() + " at " + alt1.getEmail() + " has a limit of " + alt1.getCreditLimit());
        System.out.println();

        //Alt2 lines
        System.out.println(alt2.getName() + " at " + alt2.getEmail() + " has a limit of " + alt2.getCreditLimit());
        System.out.println();

        //Alt3 lines
        System.out.println(alt3.getName() + " at " + alt3.getEmail() + " has a limit of " + alt3.getCreditLimit());
        System.out.println();

    }
}
