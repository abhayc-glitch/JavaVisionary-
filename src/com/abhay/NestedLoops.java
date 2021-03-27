package com.abhay;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //creating a program to create a rectangle of user inputted symbols.
        int rows;
        int columns;
        //We will also let the user control the amount of rows and columns.
        System.out.println("Enter the Rows you wan. ");
        rows = scanner.nextInt();
        System.out.println("Enter the columns yo wan. ");
        columns = scanner.nextInt();
        System.out.println("Enter the symbol you want ");
        //.next stores the next token we type
        String symbols = scanner.next();
        for(int i=1; i<=columns; i++){
            System.out.println();
            for(int j=1; j<=rows; j++);{
                System.out.print(symbols);
            }
        }



    }
}
