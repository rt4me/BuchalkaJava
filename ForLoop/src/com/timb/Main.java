package com.timb;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00, 2.00));

//        for(int i = 2; i <= 8; i++) {
//            //the String.format("%.2f" formats the output to have two decimals instead of the default.
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.00, i)));
//        }
//
//        System.out.println("===================");
//
//            for(int i = 8; i >= 2; i--) {
//                //the String.format("%.2f" formats the output to have two decimals instead of the default.
//                System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.00, i)));
//            }
//
//        System.out.println("===================");

            int primeCount = 0;

        for(int i=10; i <= 50; i++) {

                if(isPrime(i)) {
                    primeCount++;
                    System.out.println(i + " is a Prime number.");
                 //   System.out.println("Prime Count = " + primeCount);

                        if (primeCount == 3) {
                            System.out.println("Exiting loop");
                            break;
                        }
                }
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i = 2; i<= n/2; i++)
        if(n % i == 0) {
            return false;
        }
        return true;
        }

}
