package com.timb;

public class Main {

    public static void main(String[] args) {
	String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more";
        System.out.println(myString);
        myString = myString + " \u00A92015";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95"; //will be treated as text, not numbers
        System.out.println("The result is " + numberString);  //just appends the two numbers

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; //will NOT add them together because both are not a number
        System.out.println("LastString is equal to " + lastString); //will output 1050 to the end of this.

    }
}
