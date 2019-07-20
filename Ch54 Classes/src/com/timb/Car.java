package com.timb;

public class Car {

    //Variables that are accessible from anywhere in this Class.
    //These are referred to as "fields" (parameter)
    //private adheres to encapsulation; hides fields from outside the object (class).
    //these are state components of a car
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //Creating a method. This method will update the model
    //"model" above is a field
    //"model" below the parameter
    //This is a "setter"
    public void setModel(String model) {

        //"this" is used when referring to a field in a class.
        //the model it's being set to is from the value being passed to the method
        String validModel = model.toLowerCase(); //toLowerCase is a build-in method to lowercase the value model.
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model; //updates the "field" on line 11 with the parameter on line 19.
        } else {
            this.model = "Unknown";
        }
    }


    //This is a "getter". It is a method to return information.
    //"this" is used when referring to a field in a class.
    public String getModel() {
        return this.model;
    }
}
