package com.timb;

public class Main {

    public static void main(String[] args) {
        System.out.println(SumOdd(1,100));
        System.out.println(SumOdd(-1,100));
        System.out.println(SumOdd(100,100));
        System.out.println(SumOdd(100,-100));
        System.out.println(SumOdd(100,1000));
        System.out.println(SumOdd(1,500));
    }

    public static int SumOdd(int start, int end) {
        int sum = 0;

        if(end < start || end < 0 || start < 0) {
            return -1;
        } else {
            for(int i = start; i <= end; i++){
                if(isOdd(i)) {
                    sum = sum + i; }
            }
            return sum;
        }
    }


    public static boolean isOdd(int number) {
        if(number <= 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
