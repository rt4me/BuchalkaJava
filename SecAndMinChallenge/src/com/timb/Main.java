package com.timb;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value"; //This is a constant (static) that can be used within called methods. Contants are usually placed in all Caps.

    public static void main(String[] args) {

        System.out.println(getDurationString(59, 45));
        System.out.println(getDurationString(1,30));
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(0, 25));
        System.out.println(getDurationString(-3, 0)); //invalid
        System.out.println(getDurationString(0, -5)); //invalid
        System.out.println(getDurationString(3, 66));
	System.out.println("");
	System.out.println("Break method test");
	System.out.println("");
        System.out.println(getDurationString( 90));
        System.out.println(getDurationString(0));
        System.out.println(getDurationString(-8)); //invalid
        System.out.println(getDurationString(3666));
        System.out.println(getDurationString(39450));
    }

    private static String getDurationString(int minutes, int seconds) {

        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        int remMinutes = minutes % 60;
//Bonus to find way of adding leading zero to single digit number
/* My method but too long and wasn't working for all scenarios above.
        if (hours < 10 && minutes < 10 && seconds < 10) {
            return ("0" + hours + "h 0" + remMinutes + "m 0" + seconds + "s");
        } else if (hours < 10 && minutes < 10 && seconds >= 10) {
            return ("0" + hours + "h 0" + remMinutes + "m " + seconds + "s");
        } else if (hours < 10 && minutes >= 10 && seconds < 10) {
            return ("0" + hours + "h " + remMinutes + "m 0" + seconds + "s");
        } else if (hours >= 10 && minutes < 10 && seconds < 10) {
            return (hours + "h 0" + remMinutes + "m 0" + seconds + "s");
        } else if (hours >= 10 && minutes < 10 && seconds >= 10) {
            return (hours + "h 0" + remMinutes + "m " + seconds + "s");
        } else if (hours >= 10 && minutes >= 10 && seconds < 10) {
            return (hours + "h " + remMinutes + "m 0" + seconds + "s");
        } else return (hours + "h " + remMinutes + "m " + seconds + "s");
*/

        String hoursString = hours + "h";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = minutes + "m";
        if(remMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if(seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString;
    }

    private static String getDurationString(int seconds) {

        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remSeconds = seconds % 60;
        return getDurationString(minutes, remSeconds);

    }

    }
