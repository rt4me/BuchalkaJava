public class MinutesToYearsDaysCalculator {


    public static String printYearsAndDays (long minutes) {

        if(minutes < 0) {
            return "Invalid Value";
        } else {
            long years = minutes / (365 * 60 * 24);
            long days = (minutes % (365 * 60 * 24)) / (60 * 24);

            return minutes + " min = " + years + " y and " + days + " d";
        }
    }

}
