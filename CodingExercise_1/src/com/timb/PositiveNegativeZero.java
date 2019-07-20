package com.timb;

public class PositiveNegativeZero {

    public static void main(String[] args) { //Shortcut is to type psvm

//        checkNumber(0);
//        checkNumber(-5);
//        printMegaBytesAndKiloBytes(2050);
//        printMegaBytesAndKiloBytes(0);
//        printMegaBytesAndKiloBytes(-3);
//        bark(true, 0);
//        bark(true, 23);
//        bark(true,12);
//        bark(false,6);
//        isLeapYear(0);
//        isLeapYear(400);
//        isLeapYear(200);
//        areEqualByThreeDecimalPlaces(-3.1234, -3.123);
//        areEqualByThreeDecimalPlaces(3.176,3.175);
//        hasEqualSum(1,1,1);
//        hasEqualSum(1,1,2);
//        hasEqualSum(1,-1,0);
//        hasEqualSum(88,12,100);
//        hasEqualSum(-4,0,4);
        hasTeen(9,99,19);
        hasTeen(23,13,42);
        hasTeen(22,23,34);


    }
    public static void checkNumber(int number) {
        if(number > 0) {
            System.out.println("positive");
        } else if(number < 0) {
            System.out.println("negative");
        } else System.out.println("zero");

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;

        if(kiloBytes <= 0) {
            System.out.println("Invalid Value");
        } else System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }

    public static boolean bark(boolean barking,int hourOfDay) {

        if (barking == true && hourOfDay < 8 && hourOfDay >= 0) {
            System.out.println("True2");
            return true;
        } else if (barking == true && hourOfDay > 22 && hourOfDay <= 23) {
            System.out.println("True3");
            return true;
        } else {
            System.out.println("False4");
            return false;

        }
    }

    public static boolean isLeapYear(int year) {

        if(year < 1 || year > 9999) {
            System.out.println("False1");
            return false;
        } else if(year % 4 == 0 && year % 100 != 0) {
            System.out.println("True2");
            return true;
        } else if(year % 400 == 0) {
            System.out.println("True3");
            return true;
        } else {
            System.out.println("False4");
            return false;
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        int intNumberOne = (int)(numberOne * 1000); //(int) casts the double into a int, after it's gone through the multiplication.
        int intNumberTwo = (int)(numberTwo * 1000); //I could get rid of the variables and just put the calculation directly in the if statement.

        if(intNumberOne == intNumberTwo) {
            System.out.println("TRUE1");
            return true;
        } else {
            System.out.println("FALSE1");
            return false;
        }
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int sumCheck) {
        if(firstNumber + secondNumber == sumCheck) {
            System.out.println("TRUE");
            return true;
        } else {
            System.out.println("FALSE");
            return false;
        }
    }

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        if(teenCheck(firstNumber) == true
                || teenCheck(secondNumber) == true
                || teenCheck(thirdNumber) == true) {
            System.out.println("TRUE");
            return true;
        }  else {
            System.out.println("FALSE");
            return false;
        }
    }

    public static boolean teenCheck(int inputNumber) {
        if(inputNumber >= 13 && inputNumber <=19){
            return true;
        } else {
            return false;
        }
    }

}
