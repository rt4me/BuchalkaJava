package com.timb;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;

        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result/5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3; //the % will give the remainer of dividing the result by 3
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++; //this automatically adds one to a given variable
        System.out.println("Result is now " + result);
        result--; //this automatically subtracts one to a given variable
        System.out.println("Result is now " + result);

        result += 2;  //this would be result value plus 2
        System.out.println("Result is now " + result);

        result *= 10; //multiplies result value by 10
        System.out.println("Result is now " + result);
        result -= 10; //subtracts 10 from result value
        System.out.println("Result is now " + result);
        result /= 10;  //divide result value by 10
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == false) //double equal tests, not an assignment. NOTE no semi-colon on this line
            System.out.println("It is not an Alien");

        int topScore = 80;
        //if (topScore != 100) //!= is for not equal to test
        //if (topScore > 100) // Greater and Less than do not have an equal sign used
        //if (topScore <= 80) //This is an example of a greater/less then or equal operation
        if (topScore <= 100)
            System.out.println("You got the high score!");

        int secondTopScore = 80;
        if((topScore > secondTopScore) && (topScore < 100)) //&& is an "and" part of the operation
            System.out.println("Greater than top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90)) //double pipe is the OR operator
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50) //make sure to use the double equal signs
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("this is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false; //This is a turnary operator (shortcut of if-then-else).
        // the above operation is setting wasCar to true if isCar is true
        //If isCar is false then wasCar will be set to false.
        if(wasCar)  //This is a shortcut for checking if wasCar is true instead of if(wasCar == true)
            System.out.println("wasCar is true");

//Challenge portion

        double myFirstDouble = 20;
        double mySecondDouble = 80;

        double myFirstCalc = (myFirstDouble + mySecondDouble) * 25;
        System.out.println("myFirstCalc = " + myFirstCalc);
        double mySecondCalc = myFirstCalc % 40;
        System.out.println("Remainder is " + mySecondCalc);
        if(mySecondCalc <= 20)
            System.out.println("Total was over the limit");



    }
}
