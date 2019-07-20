package com.timb;

public class AutoXClassVerification {

    private String inputAXV;

    public void setinputAXV(String inClass) {

        this.inputAXV = inClass;
        //       System.out.println("Set the inputAXV in AutoXClassVerification. inputAXV = " + inputAXV);
        AutoXClassVerification();
    }

    public void AutoXClassVerification() {

//        System.out.println("Entering AutoXClassVerification method");
        FindClassGroup FCG1 = new FindClassGroup();
//        System.out.println("Sending data to FindClassGroup. inputAXV = " + inputAXV);
        FCG1.setInClass(inputAXV);

    }
}
