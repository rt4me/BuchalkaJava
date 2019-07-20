package com.timb;

public class Main {

    public static void main(String[] args) {
        //int newScore = calculateScore("Tim", 500);
        //System.out.println("New score is " + newScore);
        //calculateScore(75);
        //calculateScore();
        calcFeetandInchesToCentimeters(6,7);
        calcFeetandInchesToCentimeters(100);

    }

    //same method used with the same name; this is only possible with different number of data type/return type
    //public static int calculateScore(String playerName, int score) {
    //    System.out.println("Player " + playerName + " scored " + score + " points");
    //    return score * 1000;
    //}

    //public static int calculateScore(int score) {
    //    System.out.println("Unnamed player scored " + score + " points");
    //    return score * 1000;
    //}

    public static double calcFeetandInchesToCentimeters(double feet, double inches) {
        double centimeters;
        centimeters = ((feet * 12) + inches) * 2.54;

        if ((feet <= 0) || (inches < 0 || inches > 12)) {
            System.out.println("Invalid input values");
            return -1;
        }

            System.out.println("Number of centimeters in " + feet + " feet and " + inches + " inches = " + centimeters);
            return centimeters;

    }

    public static double calcFeetandInchesToCentimeters(double inches) {
        double centimeters;
        centimeters = inches * 2.54;

        if (inches < 0) {
            System.out.println("Invalid input values");
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12; //returns the remainder

        System.out.println(inches + " inches is equal to " + feet + " feed and " + remainingInches + " inches");
        return calcFeetandInchesToCentimeters(feet, remainingInches);

    }


    }

 /*    public static int calcFeetandInchesToCentimeters(double inches) {
        double totalInches = inches;
        double centimeters = totalInches * 2.54;

        if(totalInches < 0) {
            return -1;
        } else {
            System.out.println("Number of centimeters in " + inches + " and " + inches + " = " + centimeters);
            return centimeters;
        }


    }*/
