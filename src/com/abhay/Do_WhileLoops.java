package com.abhay;

        import java.util.Scanner;

public class Do_WhileLoops {
    public static void main(String[] args){
        //  DO While loop == it will perform the condition first and then evaluate the condition
        Scanner scanner  = new Scanner(System.in);
        String name = "";
        do{
            System.out.println("What is you name ");
            name = scanner.nextLine();
        } while(name.isBlank());
        System.out.print("hello " + name);
    }
}
