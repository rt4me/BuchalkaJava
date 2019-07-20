package com.timb;

public class Main {

    public static void main(String[] args) {

        System.out.println(AreaCalculator(5.0));
        System.out.println(AreaCalculator(-1));
        System.out.println(AreaCalculator(5.0, 4.0));
        System.out.println(AreaCalculator(-1.0, 4.0));
    }

    public static double AreaCalculator(double radius) {

        if(radius < 0) {
            return -1;
        }

        return 3.14159 * radius * radius;

    }

    public static double AreaCalculator(double x, double y) {

        if(x < 0 || y < 0) {
            return -1;
        }

        return x * y;

    }
}
