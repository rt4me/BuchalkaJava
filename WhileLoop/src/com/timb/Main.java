package com.timb;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println(isEvenNumber(12));
        System.out.println(isEvenNumber(-2));
        System.out.println(isEvenNumber(3));


//        count = 1;
//        while(true) {  //Alternate way of doing the above.
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        do {  //another alternate way of doing the above is the do while loop.
//            System.out.println("Count value is " + count);
//            count++;
//
//            if(count > 100) { //this is a safety measure to make sure it doesn't continually run if the while portion would never not be true.
//                break;
//            }
//        } while(count != 6);  //because the while happens after the statement, it's guaranteed to run at least once.

        int number = 4;
        int finishNumber = 20;
        count = 0;
        int sum = 0;

        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
                //if isEvenNumber returns FALSE then the process will "continue", meaning it will go the the next increment and skip any code that is below it.
                // This is a way so that only those numbers that return TRUE from isEvenNumber will will get to the Println.
            }
            count++;
            sum += number;
            System.out.println("Even number " + number);

            if(count >= 5) {
                System.out.println("Sum of the first 5 is " + sum);
                break;
            }
        }

    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
