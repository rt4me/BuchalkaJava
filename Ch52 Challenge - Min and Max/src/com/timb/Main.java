package com.timb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNum = 0;
        int maxNum = 0;
        boolean first = true; //checks to see if the number entered is the first.

        while(true) {
            System.out.println("Enter number:");

            boolean isAnInt = scanner.hasNextInt(); //checks if next input is an Integer
            if(isAnInt) {
                int inputNum = scanner.nextInt();

                if(first) { //this section is only to handle the first number that is entered so if the Min is above the default Min then it will not return 0.
                    first = false;
                    minNum = inputNum;
                    maxNum = inputNum;
                }

                if(inputNum > maxNum){
                    maxNum = inputNum;
                } else if(inputNum < minNum){
                    minNum = inputNum;
                }
            } else {
                System.out.println("Minimum Number = " + minNum + " and Maximum Number = " + maxNum);
                break;
            }
            scanner.nextLine(); //need this at the end to handle "enter" key entry

        }
        scanner.close();
    }
}
