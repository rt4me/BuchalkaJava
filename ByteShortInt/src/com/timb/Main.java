package com.timb;

public class Main {

    public static void main(String[] args) {

        // Int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);

        //Byte has a width of 8
        byte myByteValue = -128;  //Fixed number is a Literal
        byte myNewByteValue = (byte)(myByteValue/2);  //Calculation is an expression.
        // Have to "Cast" the (byte) in front because an expression defaults to Int
        System.out.println("myNewByteValue = " + myNewByteValue);

        //Short has a width of 16
        short myShortValue = 32767;

        //Loong has a width of 64; should have an "L" at the end fo the value.
        long myLongValue = 9_223_372_036_854_775_807L;














        byte validByte = 100;
        short validShort = 5000;
        int validInt = 250_000;
        long totalAll = (validByte + validInt + validShort) * 10 + 50_000;
        System.out.println("Exercise total = " + totalAll);
    }
}
