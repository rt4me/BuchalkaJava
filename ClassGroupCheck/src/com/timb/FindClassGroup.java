package com.timb;

public class FindClassGroup {

    private String InClass;
    private String UpperClass;

    public String getUpperClass() //This returns UpperClass to the caller
    {
        return UpperClass;
    }

    public void setInClass(String w)
    {
        this.InClass = w;
        classGroup(InClass);
    }

    public void classGroup (String newInClass) {
        IsValidClass ivc = new IsValidClass();
        UpperClass = InClass.toUpperCase().trim();

        //     System.out.println("Entering FindClassGroup");

        ivc.setUpperClass(UpperClass);

        if (ivc.getReturnIVC() == false) {
            System.out.println(UpperClass + " was determined to be invalid");
        } else if (UpperClass.length() > 2 && (UpperClass.substring(0, 1).equals("W"))) {
            System.out.println(UpperClass + " is Women's PAX Class");
        } else if (UpperClass.length() > 2 && (UpperClass.substring(0, 1).equals("X"))) {
            System.out.println(UpperClass + " is X-pro Class");
        } else if (UpperClass.length() > 2 && (UpperClass.substring(0, 1).equals("N"))) {
            System.out.println(UpperClass + " is Novice Class");
        } else if (UpperClass.length() > 2 && (UpperClass.substring(0, 1).equals("M"))) {
            System.out.println(UpperClass + " is Master's Class");
        }else if (UpperClass.length() == 2 && UpperClass.charAt(UpperClass.length() - 1) == 'S' && UpperClass.substring(0,1).matches("A|B|C|D|E|F|G|H")) {
            System.out.println(UpperClass + " is a Street Class");
        } else if (UpperClass.length() == 2 && UpperClass.charAt(UpperClass.length() - 1) == 'P' && UpperClass.substring(0,1).matches("A|B|C|D|E|F")) {
            System.out.println(UpperClass + " is a Prepared Class");
            //need to use .equals() because a == won't necessarily work with Strings
        } else if (UpperClass.length() == 3 && (UpperClass.substring(1, 3).equals("SP")) && UpperClass.substring(0,1).matches("A|B|C|D|E|F")) {
            System.out.println(UpperClass + " is a Street Prepared Class");
        } else if (UpperClass.length() == 3 && (UpperClass.substring(0, 2).equals("ST")) && UpperClass.substring(2,3).matches("S|X|U|R|P")) {
            System.out.println(UpperClass + " is a Street Touring Class");
        } else if (UpperClass.length() == 5 && (UpperClass.substring(0, 4).equals("CAM-")) && UpperClass.substring(4,5).matches("T|S|C")) {
            System.out.println(UpperClass + " is a CAM Class");
        } else if (UpperClass.length() == 2 && UpperClass.charAt(UpperClass.length() - 1) == 'M' && UpperClass.substring(0,1).matches("A|B|C|D|E|F|S")) {
            System.out.println(UpperClass + " is a Modified Class");
        } else {
            System.out.println(UpperClass + " is an unknown Class");
        }
    }
}
