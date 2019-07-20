package com.timb;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	    calcFeedAndInchesToCent(6, 0);
        calcFeedAndInchesToCent(0, 7);
        calcFeedAndInchesToCent(-1, 5);  //invalid
        calcFeedAndInchesToCent(1, 0);
        calcFeedAndInchesToCent(1, -3);  //invalid
        calcFeedAndInchesToCent(1, 55);  //invalid

        System.out.println("Break in input");

        calcFeedAndInchesToCent(100);
        calcFeedAndInchesToCent(-3);  //invalid
        calcFeedAndInchesToCent(12);
        calcFeedAndInchesToCent(17);
    }


    public static double calcFeedAndInchesToCent(double feet, double inches) {

        if((feet < 0) || (inches < 0 || inches > 12)){
            System.out.println("Invalid input (" + feet + ", " + inches + ")");
            return -1;
        }

        double calcCent = (((feet * 12) + inches) * 2.54);
            System.out.println(feet + " feet, " + inches + " inches is " + calcCent + " centimeters");
            return calcCent;
    }

    public static double calcFeedAndInchesToCent(double inches) {
        int feet = (int)inches / 12;
        double inchRem = inches % 12;

        if (inches < 0){
            System.out.println("Invalid input (" + inches + ")");
            return -1;
        }

        double calcCent = (inches * 2.54);
        System.out.println(inches + " inches is " + feet + " feet, " + inchRem + " inches");
        //System.out.println(feet + " feet, " + inchRem + " inches is " + calcCent + " centimeters");  Not needed because calling the 2 value method in below return.
        return calcFeedAndInchesToCent(feet, inchRem);
    }

}
