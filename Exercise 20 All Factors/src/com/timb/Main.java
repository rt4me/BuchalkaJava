package com.timb;

public class Main {

    public static void main(String[] args) {
        printFactors(6);
        System.out.println("================");
        printFactors(32);
        System.out.println("================");
        printFactors(10);
        System.out.println("================");
        printFactors(222);

    }

    public static void printFactors(int number) {

        int num = 0;
        if(number < 1) {
            System.out.println("Invalid Value");
        } else {
            while (num <= number / 2) {
                num++;
                if (number % num == 0) {
                    System.out.println(num);
                }
//                else {
//                    num++;
//                }
            }
            System.out.println(number);
        }

    }
}
