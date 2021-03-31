package com.abhay;

public class Constructors {
    public static void main(String args){
        //a constructor is special method that is called when an object in created.
        //it Helps us Initialize new objects at any time even with just ONE human class
        Human human = new Human("Abhay",1 , 65 );
        Human human2 = new Human("Morty",1 , 65 );
        //if we leave the para's blank it will give us an error because down in our human class you are saying that in order for a human to be "Construcuted" we need a name, an age, and a weight.
        System.out.println(human.name);


    }
}
