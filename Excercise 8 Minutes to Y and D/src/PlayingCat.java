public class PlayingCat {

    public static boolean isCatPlaying (boolean summer, int temperature){
        if (summer == true) {
//            System.out.println("Summer Path");
            if (temperature > 25 && temperature < 45) {
                return true;
            } else {
                return false;
            }
        }

        else if (temperature > 25 && temperature < 35) {
//            System.out.println("non-summer path");
            return true;
        } else {
            return false;
        }
    }
}
