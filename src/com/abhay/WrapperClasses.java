package com.abhay;

public class WrapperClasses {
    public static void main(String[] args){
        // wrapper class =  provides a way to use primitive data types as reference data types
        // reference data types contain useful methods
        // can be used with collections (ex.ArrayList)

        //primitive  //wrapper
        //---------  //-------
        // boolean  Boolean -- every Java primitive data type has its own predefined wrapper class.
        // char    Character
        // int     Integer
        // double  Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
        // these are Java commands that help us create a java wrapper class automatically.

        //Wrapper class Boolean...
        boolean b = true;
        Boolean a = true;
        //both of these are different commands.
        //The top one is making a regular boolean value equal to false
        //Yet the bottom one makes a reference data type boolean.
        Integer c = 4;
        Double d = 3.14159;
        String e = "Abhay";
        //A string is always capitalized so its always a reference datatype.
        //The Reason we use wrapper classes is because we can have primitive types use a lot of cool methods.
        if (a == true){
            System.out.println("This is "+a);

        }



    }
}
