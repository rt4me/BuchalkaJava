package com.timb;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score >1000) { //Must use bracket if there are multiple lines; good practice to use them even if only one line.
//            System.out.println("Your score was less then 5000 but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if(gameOver == true) { //An alternate way of typing this line is     if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);  //This finalScore variable can't be used outside the brackets
            System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("The second run's final score was " + finalScore);
        }



    }
}
