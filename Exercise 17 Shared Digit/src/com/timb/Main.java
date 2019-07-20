package com.timb;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(12, 43));
    }

    public static boolean hasSharedDigit(int num1, int num2) {

        if(num1 >= 100 || num1 < 10 || num2 >= 100 || num2 < 10) {
            return false;
        } else if(num1 % 10 == num2 % 10 ||
                num1 / 10 == num2 / 10 ||
                num1 % 10 == num2 / 10 ||
                num1 / 10 == num2 % 10) {
            return true;
        } else {
            return false;
        }
    }
}
