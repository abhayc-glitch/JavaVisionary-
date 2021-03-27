package com.abhay;
import java.util.Scanner;
public class IFstatements {
    public static void main(String[] args){
        //if statements...
        //basic form of decision making for the computer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yo age: ");
        int age = scanner.nextInt();

        if(age==18) {
            System.out.println("You are 18");
        }
        else if(age>=75) {
            System.out.println("BOOMER MEANS? Bubble gum ah?");
        }
        else {
            System.out.println("You have no friends");
        }


    }
}
