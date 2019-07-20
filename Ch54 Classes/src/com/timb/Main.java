package com.timb;

public class Main {

    public static void main(String[] args) {

        //creates an object of type Car. Always need to initialize a new class
        //porsche and holden are the name of the Objects, based on the template, Car.
        //each object needs to be initialized; using "new"
        Car porsche = new Car();
        Car holden = new Car();

        //use "setModel" to match the name of the method in the Car class.
        porsche.setModel("Carrera");

        //Pulls information from the getModel method in the Car class.
        System.out.println("Model is " + porsche.getModel());
    }
}
