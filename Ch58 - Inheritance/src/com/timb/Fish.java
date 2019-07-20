package com.timb;

public class Fish extends Animal {

        //characteristics that are specific to Fish
    private int gills;
    private int eyes;
    private int fins;

    //initialized Fish specific characteristics from above plus the inherited characteristics from Animal.
    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight); //Defaulting brain and body since they will be the same for all.
        // Removed them from the initialization list for Fish 2 rows up.
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed); //calling the Move method from the Animal class


    }
}
