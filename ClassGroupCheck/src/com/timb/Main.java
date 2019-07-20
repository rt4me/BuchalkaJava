package com.timb;
import java.util.Scanner;
public class Main {

    public static void main(String [] args) {
        AutoXClassVerification axv = new AutoXClassVerification();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a class:");
        String inputClass = keyboard.next();

        axv.setinputAXV(inputClass);

//    System.out.println("entering setinputAXV");

//        axv.setinputAXV("Cp");
//        axv.setinputAXV("wFSP");
//        axv.setinputAXV("XGS");
//        axv.setinputAXV(" str");
//        axv.setinputAXV("G ");
//        axv.setinputAXV("GSP");
//        axv.setinputAXV("C.P");
////    axv.setinputAXV(""); //Causes a java.lang.StringIndexOutOfBoundsException error
//        axv.setinputAXV("NCAM-T");
//        axv.setinputAXV("CAM-S");
//        axv.setinputAXV("MCAM-C");
        System.out.println("Back in Main");
        System.out.println();
    }
}
