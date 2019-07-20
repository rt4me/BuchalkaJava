package com.timb;

public class BankAccount {

    private int accountNum;
    private int balance;
    private String custName;
    private String email;
    private long phoneNum;
    private int deposit;
    private int withdrawl;

    //DEFAULT CONSTRUCTOR: This is optional but is a case where a Constructor can be created to given default values to some fields.
    //This is calling a constructor within a constructor since it's calling BankAccount within the BankAccount object.
    //No parameters are listed inside the parenthesis for BankAccount so any instance calling it in Main with no Parameters will use this.
    public BankAccount() {
        this(8888, 30, "Default Name", "Default email", 2222222222L);
    }

    //CONSTRUCTOR: the following is a constructor
    //it's a way to be able to set multiple fields with one call in the Main method.
    //This would be considered the primary one because it's doing all the initialization and then the others ("DEFAULT" & "Alternate2") call this.
    public BankAccount(int accountNum, int balance, String custName, String email, long phoneNum) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.custName = custName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    //ALTERNATE2 CONSTRUCTOR: Default some and use some incoming values; this would be designated on the Main class because it has different parameters than the others.
    public BankAccount(String custName, String email, long phoneNum) {
        this(9999, 499, custName, email, phoneNum);
    }


    //To automatically create Getter and Setters, select Generate from the Code menu or Ctrl-N



    //Account Number
    public void setAccountNum(int accountNum) {
        if(accountNum < 1 && accountNum > 9999) {
            System.out.println("Invalid Account Number.");
        } else {
            accountNum = accountNum;
        }
    }

    public int getAccountNum() {
        return this.accountNum;
    }

    //Customer Name
    public void setCustName(String custName) {
        custName = custName.toUpperCase();
    }

    public String getCustName() {
        return this.custName;
    }

    //Email
    public void setEmail(String email) {
        email = email.toUpperCase();
    }

    public String getEmail() {
        return this.email;
    }

    //Phone Number
    public void setPhoneNum(long phoneNum) {
        if(phoneNum < 2002000000L || phoneNum > 9999999999L) {
            System.out.println("Invalid phone number");
        }
    }

    public long getPhoneNum() {
        return this.phoneNum;
    }

    //Deposits
    public void setDeposit(int deposit) {
        this.balance += deposit;
        System.out.println("With deposit of " + deposit + ", your new Balance is " + balance);
    }

    public int getBalance() {
        return this.balance;
    }


    //Withdrawals
    public void setWithdrawl(int withdrawl) {
        if(balance - withdrawl < 0) {
            System.out.println("Insufficient funds to cover " + withdrawl +"; Payment won't be processed");
        } else {
            balance -= withdrawl;
            System.out.println("With withdrawl of " + withdrawl + ", your new Balance is " + balance);
        }
    }

    public int getWithdrawl() {
        return this.balance;
    }



}
