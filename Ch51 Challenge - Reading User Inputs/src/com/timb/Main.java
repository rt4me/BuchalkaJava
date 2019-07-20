package com.timb;

import java.util.Scanner;

public class Main {
//My Version -- edited with notes from answer
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while(count <= 10) {  //this can be while(true) instead of specifically calling out; just need to use a break later.
            System.out.println("Enter number #" + count + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                if(count == 10) {
                    System.out.println("Sum of all entries is " + sum);
//                    break;  --not needed since the while has a limiter
                }
                count++;
            } else{
                System.out.println("Invalid Number");
//                continue;  //found that this wasn't needed.
            }
            scanner.nextLine(); //this is to handle next line character (enter key); place after "if" group so it applies to if and else.

        }
        scanner.close();
    }

    //Instructor version
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        int counter = 0;
//        int sum = 0;
//
//        while(true) {
//            int order = counter + 1;
//            System.out.println("Enter number #" + order + ":");
//
//            boolean isAnInt = scanner.hasNextInt();
//
//            if(isAnInt) {
//                int number = scanner.nextInt();
//                counter++;
//                sum += number;
//                if(counter == 10) {
//                    break;
//                }
//            } else {
//                System.out.println("Invalid number");
//            }
//
//            scanner.nextLine(); //this is to handle next line character (enter key)
//        }
//        System.out.println("sum = " + sum);
//        scanner.close();
//    }
}
