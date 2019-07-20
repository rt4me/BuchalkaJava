package com.timb;

public class Main {

    public static void main(String[] args) {

        //Can designate multiple fields by setting up a CONSTRUCTOR on the called Method.
        BankAccount tim1 = new BankAccount(67890, 500, "Tim Bergin", "Tim@tim.com", 9725556351L );
        BankAccount def1 = new BankAccount(); //No parameters given so using the Default Constructor.
        BankAccount alt2 = new BankAccount("Bob", "Bob@gmail.com", 9724561234L);


        //tim1 related lines
        System.out.println("Name: " + tim1.getCustName());
        System.out.println("Account#: " + tim1.getAccountNum());
        System.out.println("Email: " + tim1.getEmail());
        System.out.println("Phone: " + tim1.getPhoneNum());
        System.out.println();

        tim1.setDeposit(200);
        tim1.setWithdrawl(150);
        tim1.setWithdrawl(900);

        System.out.println("Current balance is " + tim1.getBalance());

        System.out.println();
        System.out.println();

        //Default CONSTRUCTOR related lines.
        //Used the Default constructor because no parameters were noted on the call above
        System.out.println("Name: " + def1.getCustName());
        System.out.println("Account#: " + def1.getAccountNum());
        System.out.println("Email: " + def1.getEmail());
        System.out.println("Phone: " + def1.getPhoneNum());
        System.out.println();

        def1.setDeposit(200);
        def1.setWithdrawl(150);
        def1.setWithdrawl(900);

        System.out.println("Current balance is " + def1.getBalance());

        System.out.println();
        System.out.println();

        //alt2 related lines; uses the Alternate2 CONSTRUCTOR from the BankAccount class
        //because it used that parameter layout in line 10 above.
        System.out.println("Name: " + alt2.getCustName());
        System.out.println("Account#: " + alt2.getAccountNum());
        System.out.println("Email: " + alt2.getEmail());
        System.out.println("Phone: " + alt2.getPhoneNum());
        System.out.println();

        alt2.setDeposit(20);
        alt2.setWithdrawl(185);
        alt2.setWithdrawl(200);

        System.out.println("Current balance is " + alt2.getBalance());
    }
}
