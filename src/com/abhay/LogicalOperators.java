package com.abhay;
import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args){
        //logical Operators are used to connect two or more expressions.
        // && = (AND) == both conditions must be true...(Replacement for Nested if statement)
        int temp = 69;
        if (temp>30){
            System.out.println("Its Hot out");
        }
        else if (temp>=20 && temp<=30){
            System.out.println("ig its warm ionknow");
        }
        else{
            System.out.println("this shit cold");
        }
        // || = (or) == either of the conditions must be true.
        // to replicate this prompt we will create a quit function within an imaginary game.
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game!");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        }
        else {
            System.out.println("You is still playing");
        }

        //(We arent using .nextLine() because we have to store the next KEY we put into a variable. )
        // When dealing with strings we use nextLine() and when dealing with keys we use straight up .next
        //===============================================================================================
        // ! = (not) == reverses boolean value of the condition.
        //Basically when you put a
        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You quit the game");
        }
        else {
            System.out.println("You is still playing");
        }




    }
}
