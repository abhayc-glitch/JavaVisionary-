package com.abhay;
import java.util.Scanner;
//we import it here
public class UserInput   {
    public static void main(String[] args){
        //finding user input through the scanner command but we have to import it first.
        //Scanner is a class in java. util package used for obtaining the input of the primitive types like int, double, etc. and strings.
        //It is the easiest way to read input in a Java program, though not very efficient if you want an input method for scenarios where time is a constraint like in competitive programming
        Scanner scanner = new Scanner(System.in);
        //creating the scanner...
        //^^^ "scanner" is the name of our scanner
        System.out.println("What is your name ");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name);

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        //We can make it selective to only Integer input..
        System.out.println("You are "+age+" years old!");
        scanner.nextLine();
        //We have to clear the scanner on the last line of input because it skips over it due to the nextline()
        System.out.println("What do you hate? ");
        String hate = scanner.nextLine();
        System.out.println("You really hate "+hate+", don't you");



    }
}
