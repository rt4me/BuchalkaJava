package com.timb;

import java.util.Scanner; //Needed in order to use the Scanner feature.

public class Main {

    public static void main(String[] args) {
	int count = 1;
	int sum = 0;
	Scanner scanner = new Scanner(System.in);


	while(true) {//usually I would put a check for the count number here but it's good practice to use the "break" later instead
        System.out.println("Enter number #" + count + ":");
        boolean isAnInt = scanner.hasNextInt();

	    if(isAnInt) {
            int number = scanner.nextInt();
            sum += number;
            count++;
            if(count == 10) {
                break;
            }
	    } else {
            System.out.println("Invalid Number.");
        }

        scanner.nextLine(); //handle end of line (enter key) and invalid input; Put her instead of inside the "if"
    }
        System.out.println("Sum of all numbers is " + sum);
        scanner.close();

    }
}
