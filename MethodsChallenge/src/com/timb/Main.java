package com.timb;

public class Main {

    public static void main(String[] args) {
	String playerName;
	int score;

	int playerPosition = calculateHighScorePosition(1500);
	displayHighScorePosition("Doug",playerPosition);

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Stan",playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Judy",playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Sam",playerPosition);
    }

    public static void displayHighScorePosition (String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");

    }

    public static int calculateHighScorePosition(int score) {
//        if(score >= 1000) {
//            return 1;
//        } else if (score >= 500 && score < 1000) {
//            return 2;
//        } else if (score >= 100 && score < 500) {
//            return 3;
//        } else {
//            return 4;

        //Alternate way would be as follows. Only need 1 return and can get rid of the &&
        int position = 4; //assuming position will be 4 (last) will be returned.

        if(score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100); {
            position = 3;
        }

        return position;
    }

}
