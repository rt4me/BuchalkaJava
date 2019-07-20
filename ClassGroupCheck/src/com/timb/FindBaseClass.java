package com.timb;

public class FindBaseClass {

//This class strips leading class modifiers in order to get the base class
    //Need to Add check for Ladies group

    private String UpperClass;
    private String returnFBC;

    public String getUpperClass()
    {
        return returnFBC;
    }

    public void setUpperClass(String b)
    {
        this.UpperClass = b;
        baseClass(UpperClass);
    }

    public void baseClass (String UpperClass) {
//        System.out.println("Entering FindBaseClass");

        if (UpperClass.substring(0, 1).matches("W|X|N|M")) {
//            System.out.println("Returning " + inClass.substring(1, inClass.length()) + " from baseClass");
            returnFBC = UpperClass.substring(1, UpperClass.length());
        } else {
//            System.out.println("Returning " + inClass + " from baseClass");
            returnFBC = UpperClass;
        }

    }
}
