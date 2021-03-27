package com.abhay;

public class Methods {
    public static void main(String[] args){
        //Equal to the python's FUNCTION
        //a group of code that is called over and over again.
        //method prototype
        //main == is a name for this entire method
        // You cant have a method inside of a method
        // Initialize a method by using...
        two();
        int age = 5;
        printAge(10);
        int number = 5;
        boolean correct = false;
        problem(6,  correct);

    }
    public static void two() {
        System.out.println("This is a method!!!");
    }
    public static void printAge(int age) {
        //the "int age" is just what the EXPECTANCY
        System.out.println(age);
    }
    //___________________________________________________
    //Revanth Class Problems
    public static void problem(int number, boolean correct) {
        if(correct) {
            System.out.println(number);

        }
    }
}
