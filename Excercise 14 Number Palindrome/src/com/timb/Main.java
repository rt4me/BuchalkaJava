package com.timb;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-212));
    }

    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int lastDigit = 0;
        int num = number;

        while(num != 0) {  //doing the not equal 0 instead of > 0 handles negative incoming values.
            lastDigit = num % 10; //gets the last digit of the Num value
            reverse = (reverse * 10) + lastDigit; //builds the sum of all the digits found
            num /= 10; //cuts the last digit from the num value.
        }

        if(number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
