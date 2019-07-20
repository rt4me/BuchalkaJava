package com.timb;

public class Main {

    public static void main(String[] args) {
        int myIndValue = 5 / 2; //Dividing an Int will not return a decimal part of value; Value returned would be 2 here.
        float myFloatValue = 5f; //put an 'f' after float number
        double myDoubleValue = 5d; //put a 'd' after double number (or just put a decimal value); Double is faster on most computers

        System.out.println("myIntValue =" + myIndValue);
        System.out.println("myFloadValue = " + myFloatValue);
        System.out.println("myDoubelValue = " + myDoubleValue);

        //Exercise

        float myPounds = 200f;
        double myKilograms = myPounds * 0.45359237d;
        System.out.println("Kilos = " + myKilograms);
    }
}
