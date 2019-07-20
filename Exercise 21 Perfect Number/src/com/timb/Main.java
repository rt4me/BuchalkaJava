package com.timb;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-2));

    }

    public static boolean isPerfectNumber(int number) {

        int num = (number / 2);  //only check the first half of number bacause you can't be divisible by a number over half itself; Save processing.
        int sum = 0;
        if (number < 1) {
            return false;
        } else {
            while (num > 0) {
                if (number % num == 0) {
                    sum += num;
                    num--;
                } else {
                    num--;
                }
            }

            if (sum == number) {
                return true;
            } else {
                return false;
            }
        }
    }
}
