package com.timb;

public class IsValidClass {

    private String UpperClassIVC;
    private boolean returnIVC;

    public boolean getReturnIVC()
    {
        return returnIVC;
    }

    public void setUpperClass(String t)
    {
        this.UpperClassIVC = t;
        validClass(UpperClassIVC);
    }

    public void validClass (String newUpperClass) {

        //       System.out.println("Entering IsValidClass");

        FindBaseClass fbc = new FindBaseClass();
        fbc.setUpperClass(newUpperClass);
        String baseClass = fbc.getUpperClass();

        if (baseClass.length() > 6 || baseClass.length() < 2) {
            System.out.println("Class not a valid length");
            returnIVC = false;
        } else if (baseClass.matches("AS|BS|CS|DS|ES|FS|GS|HS|ASP|SSP|BSP|CSP|DSP|ESP|FSP|SM|SSM|AM|BM|DM|CM|EM|FM|STR|STS|STU|STX|SSC|AP|BP|CP|DP|EP|FP|CAM-C|CAM-S|CAM-T")) {
            //            System.out.println(inClass + " is a valid class");
            returnIVC = true;
        } else {
            //System.out.println(inClass + " is an invalid class");
            returnIVC = false;}
    }
}
