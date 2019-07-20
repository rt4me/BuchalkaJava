package com.timb;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                " a valid" +
                " statement.");

        //The below is 3 statements on one line which is valid but not recommended
        int anotherVariable = 50;myVariable--;System.out.println("This is another valid statement but not recommended");
    }
}
