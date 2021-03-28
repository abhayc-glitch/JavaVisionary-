package com.abhay;

import java.util.Scanner;

public class OOPS {
    public static void main(String[] args){
        // objects are something that have a class that we can assign attributes(characteristics) nad we can encorperate methods (abilities.)
        //This creates a car object
        car myTesla = new car();
        //so if we want the model we can say
        System.out.println(myTesla.model);
        //literelly SOOOO cool

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("What do you want to do? ");
            String answer = scanner.nextLine();
            if (answer.equals("Get in")){
                myTesla.getin();
                System.out.println("What do you want to do? ");
                answer = scanner.nextLine();
                if (answer.equals("Drive")){
                    myTesla.drive();
                }
                else if (answer.equals("Know my car's Model")){
                    System.out.println(myTesla.model);
                }
                else{
                    myTesla.brake();
                }
            }
            else if (answer.equals("Drive") || answer.equals("Brake")){
                System.out.println("Slow Down! You have get in first! ");
            }
            else{
                System.out.println("That isnt an option lol. ");
            }

        }

    }

}
class car {
    String make = "Tesla";
    String model =  "Model Y";
    int year = 2021;
    String color = "red";
    double price = 50000.00;

    void getin() {
        System.out.println("You got in the car!");
    }
    void drive() {
        System.out.println("You are driving the car!");
    }
    void brake() {
        System.out.println("You pressed the brake!");
    }


}