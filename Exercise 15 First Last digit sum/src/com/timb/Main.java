package com.timb;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-25));
    }

    public static int sumFirstAndLastDigit (int number) {
        int firstNum = 0;
        int lastNum = number % 10;
        int num = number;

        if(number < 0) {
            return -1;
        }

        while(num != 0) {
            firstNum = num % 10; //assigns the value of the last digit to the firstNum. It should work it's way to the first digit of the incoming value through the while block.
            num /= 10; //resets the num value to the last num value minus the last digit. (ex incoming 512 will now be 51)
        }
        return (firstNum + lastNum);
    }
}
