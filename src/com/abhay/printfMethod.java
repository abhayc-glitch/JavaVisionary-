package com.abhay;

public class printfMethod {
    public static void main(String[] args){
        // printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)
        //				% [flags] [precision] [width] [conversion-character]
        System.out.printf("THis is a basic format String %d",123);
        //%d is a conversion charectar
        boolean value = true;
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Nigga";
        int myInt = 50;
        double myDouble = 1000;
        System.out.printf("%b", value);
        System.out.printf("%b",myBoolean);
        System.out.printf("%c",myChar);
        System.out.printf("%s",myString);
        System.out.printf("%d",myInt);
        System.out.printf("%f",myDouble);

        //[width]
        // minimum number of characters to be written as output
        System.out.println();
        //if we want 10 spaces of width we say %10s
        System.out.printf("Hello %s",myString);

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        //This will only have one digit after he decimal places
        System.out.printf("You have this much money %.1f",myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        System.out.printf("You have this much money %,f",myDouble);


    }
}
