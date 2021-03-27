package com.abhay;

public class switches {
    public static void main(String[] args) {
        //switch == a statement that helps you test a variable/any other values) against a group of values to check if any of them match.
        // Each value is called a case, and the variable being switched on is checked for each case.
        String day = "Pixxa";
        switch(day){
            case "Sunday": System.out.println("It is sunday");
            break;
            //have to add break so that we can switch out of our case and continue with our next case.
            case "Monday": System.out.println("It is Monday");
            break;
            case "Tuesday": System.out.println("It is Tuesday");
            break;
            case "Wednesday": System.out.println("It is Wednesday");
            break;
            case "Thurday": System.out.println("It is Thursday");
            break;
            case "Friday": System.out.println("It is Friday");
            break;
            case "Saturday": System.out.println("It is sunday");
            break;
            default: System.out.println("This is not a day!");
            //It's going to test the "day" value against all these cases we provided it and it will stop once we hit one and do the given action at the end of it.
            //If there is no match then it will do nothing.
            // Why are switches important...
            // So we don't have to write a billion if statements
        }

    }
}
