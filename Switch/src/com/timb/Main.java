package com.timb;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        int switchValue = 3;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("was a 3, or a 4, or a 5");
//                System.out.println("Actually is was a " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }

        char switchValue = 'D';

        switch(switchValue) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchValue + " was found");
                break;

            default:
                System.out.println("Not any of the first letters");
                break;
        }

        String month = "January";
        switch(month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("Jun");
                break;
                default:
                    System.out.println("Not sure");
        }
    }
}
