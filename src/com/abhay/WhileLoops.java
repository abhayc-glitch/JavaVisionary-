package com.abhay;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args){
        // While loop == a block of code that is always executed until the condition remains true.
        Scanner scanner  = new Scanner(System.in);
        String name = "";
        while(name.isBlank()) {
            System.out.println("What is you name ");
            name = scanner.nextLine();
        }
        System.out.print("hello " + name);
    }
}
