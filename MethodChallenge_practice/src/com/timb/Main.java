package com.timb;

public class Main {

    public static void main(String[] args) {

        int scorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Doug",scorePosition);

        scorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Judy", scorePosition);

        scorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("John",scorePosition);

        scorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Donald",scorePosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position "
                + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if(score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } //else {  //don't need this extra else, just put the return 4 after the Ifs.
          //  return 4;
        //}

        return 4;
    }
}
