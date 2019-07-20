package com.timb;

public class Main {

    public static void main(String[] args) {
        isLeapYear(800);
        getDaysInMonth(1,2020);
        getDaysInMonth(2,2020);
        getDaysInMonth(2,2018);
        getDaysInMonth(-1,2018);
        getDaysInMonth(12,-2020);
        getDaysInMonth(12,2018);
    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
           // System.out.println("first false");
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
           // System.out.println("first true");
            return true;
        } else if (year % 400 == 0) {
           // System.out.println("second true");
            return true;
        } else {
           // System.out.println("default false");
            return false;
        }
    }

    public static int getDaysInMonth (int month, int year) {

        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return -1;
            //System.out.println("-1");
        } else if (isLeapYear(year) && month == 2) {
            return 29;
//            System.out.println("29");
        } else {

            switch (month) {  //started with 1 case for each month but then saw I could combine.
                //Originally had PrintLn but got errors when submitting on website; they were looking for returns.
//                case 1: case 3: case 5: case 7: case 8: case 10:
//                    System.out.println("31");
//                    break;
                case 2:
//                    System.out.println("28");
                    return 28;
//                    break;
//                case 3:
//                    System.out.println("31");
//                    break;
                case 4: case 6: case 9: case 11:
//                    System.out.println("30");
                    return 30;
//                    break;
//                case 5:
//                    System.out.println("31");
//                    break;
//                case 6:
//                    System.out.println("30");
//                    break;
//                case 7:
//                    System.out.println("31");
//                    break;
//                case 8:
//                    System.out.println("31");
//                    break;
//                case 9:
//                    System.out.println("30");
//                    break;
//                case 10:
//                    System.out.println("31");
//                    break;
//                case 11:
//                    System.out.println("31");
//                    break;
                default:
//                    System.out.println("31");
                    return 31;
//                    break;
            }
        }
    }
}
