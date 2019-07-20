package com.timb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt(); //checks to see if next input (year) is a valid integer.

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //this is used to handle hitting the Enter key after entering the DoB value.

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Input can't be parsed to Int.");
        }
        scanner.close();
    }
}
