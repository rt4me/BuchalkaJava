package com.timb;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigit(54321));
        System.out.println("==============");
        System.out.println(sumDigitAnswer(324));
    }

    public static int sumDigit(int number) { //My attempt


        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number / 10 > 0) {

            sum = sum + (number % 10);
//            System.out.println("Number being added to sum: " + (number % 10));
//            System.out.println("Sum in loop: " + sum);
            number = number / 10;
//            System.out.println("Next number in loop: " + number);

            if(number / 10 > 0){
                continue;
            }
            }
        return sum + number;
    }

    private static int sumDigitAnswer(int number) { //His answer

        if (number < 10) {
            return -1;
        }

        int sum = 0;
        //125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 -120 = 5  this gets the least significant digit
        while(number > 0) {
            //extract least significant digit
            int digit = number % 10;
            sum += digit;
            //drop least significant digit
            number /= 10; // same as number = number / 10;
        }

        return sum;
    }
}
