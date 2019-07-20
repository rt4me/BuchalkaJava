package com.timb;

public class Main {

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(-12);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(0);

    }

    public static int reverse(int number) {  //reversing incoming number so it will "say" it in the right order
        int reverse = 0;
        int num = number;

        while(num != 0) { //made this not equal to one instead of > 0 so it would handle incoming negatives.
            reverse = (reverse * 10) + (num % 10);
            num = num / 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) { //getting a count of the number of digits so it handles trailing zeroes okay.
        int count = 0;

        if(number == 0) {
            count = 1;
        } else if(number < 0) {
            count--;
        }

        while(number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void numberToWords(int number) {
        int count = getDigitCount(number); //count of the number of digits
        int reverseNum = reverse(number); //input in reverse order

        if(number < 0){
            System.out.println("Invalid Value");
        } else {
            while(count > 0) {
                count--;
                int currentNumber = reverseNum % 10;
                reverseNum /= 10;
                switch(currentNumber) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
        }

    }
}
