package com.timb;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(2, 1, 5));
        System.out.println("===========");
        System.out.println(canPack(1, 0, 4));
        System.out.println("===========");
        System.out.println(canPack(1, 0, 5));
        System.out.println("===========");
        System.out.println(canPack(0, 5, 4));
        System.out.println("===========");
        System.out.println(canPack(2, 2, 12));
        System.out.println("===========");
        System.out.println(canPack(-3, 2, 12));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if(bigCount < 0 || smallCount < 0 || goal < 0) {
//            System.out.println("1st False");
            return false;
        }

        if(goal % 5 > smallCount) {
//            System.out.println("2nd False");
            return false;
        } else if(((bigCount * 5) + smallCount) < goal){
//            System.out.println("3rd False");
            return false;
        } else {
            return true;
        }
    }
}
