package com.timb;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

        public static int getEvenDigitSum(int number) {

        if(number < 0) {
            return -1;
        }

        int num = number;
        int sum = 0;

        while(num > 0) {
            if(num % 2 != 0) {
                num /= 10;
                continue;
            }

            sum = sum + (num % 10);
            num /= 10;
        }

        return sum;
    }
}
