package com.timb;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println("=============");
        System.out.println(getLargestPrime(3003));
        System.out.println("=============");
        System.out.println(getLargestPrime(35));
        System.out.println("=============");
        System.out.println(getLargestPrime(45));
        System.out.println("=============");
        System.out.println(getLargestPrime(14));
        System.out.println("=============");
        System.out.println(getLargestPrime(77));
        System.out.println("=============");
    }

    public static int  getLargestPrime(int number) {

        if(number<0||number==0||number==1)
        {
            return -1;
        }

        int i=1;
        while(i<=number)
        {
 //           System.out.println("Main loop i = " + i);
            i++;
            if(number%i==0)
            {   while(number%i==0)
            {
 //               System.out.println("Divide by " + i);
                number=number/i;
//                System.out.println("Number is now:" + number);
            }
                if(number==1)
                    return i;
            }
//            System.out.println("Return to main loop");
        }
        return -1;
    }
}
