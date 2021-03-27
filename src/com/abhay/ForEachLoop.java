package com.abhay;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args){
        // for-each = 	traversing technique to iterate through the elements in an array/collection
        //				less steps, more readable
        //				less flexible
        // can help when iterating through data structures.
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("bird");
        //The colon represent in like (for i in range)
        //This will stand for each index in animals.
        for(String i : animals) {
            System.out.println(i);
        }

    }
}
