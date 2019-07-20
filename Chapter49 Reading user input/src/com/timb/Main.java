package com.timb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //Scanner is built in class

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt(); //Checks to see if next input is an Int.
        if(hasNextInt) {  //If boolean is true, continue on. Else Invalid year of birth
            int yearOfBirth = scanner.nextInt(); //allows the getting Integer.
            scanner.nextLine(); //this is to handle next line character (enter key)

            System.out.println("Enter you name: ");
            String name = scanner.nextLine();  //this retrieves the information form the console.
            int age = 2018 - yearOfBirth;

            if(age >= 0 && age <=120){
                System.out.println("Your name is " + name + ", and you are " + age + " year old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Year input is not a integer.");
        }
            scanner.close();
    }

}