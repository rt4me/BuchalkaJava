package com.timb;

public class Main {

    public static void main(String[] args) {
        //Challenge to find numbers that can be divided by both 3 and 5 and sum them

        int numSum = 0;
        int count = 0;

        for(int i=1; i <=1000; i++) {
	    if((i % 3 == 0) && (i % 5 == 0)) {
            System.out.println("The number " + i + " meets the criteria.");
            numSum += i;  //adds "i" value to existing numSum
            count++;  //increments count up 1
        }

            if(count == 5) { //limit to only 5 matches
                System.out.println("Sum of the numbers is " + numSum);
                break;
            }

        }

    }
}
