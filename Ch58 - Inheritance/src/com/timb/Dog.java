package com.timb;

public class Dog extends Animal { //Use the extends keyword to use the state behavior from Animal for Dog class.

    //These are unique characteristics relating to Dog in addition to the characteristics of Animal class pulled in further down.
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //with the above "extends" Animal filled in, if I used ctrl-N and select Constructor it automatically creates the below CONSTRUCTOR.
    //This pulls over the CONSTRUCTOR information from the Animal CONSTRUCTOR since Dog is part of Animal
    //But then we added the eyes, legs... from the parameters above specific to Dog
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); //initialize the Animal parameters; defaulted brain and body to 1 since it's true for all
        this.eyes = eyes; //additionally initialize the Dog specific characteristics.
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    //To get the Method Override, hit Ctrl-N and select Override Methods
    //This will mean the eat() method defined in the Animal class is not used when calling it in associatiion with Dog.
    @Override
    public void eat() {
        System.out.println("Dog.eat() called"); //Added for tracking.
        chew(); //This calls the chew() method above.
        super.eat(); //This calls the eat() method in the Animal class. You don't necessarily need to call the super class (Animal)
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }
}
