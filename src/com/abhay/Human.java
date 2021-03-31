package com.abhay;

public class Human{
    //creating a constructor...
    String name;
    int age;
    double weight;
    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
        //the "THis" keyword to call another constructor in the same class
    }
    void eat(){
        System.out.println(this.name + " is eating.");
    }
}
