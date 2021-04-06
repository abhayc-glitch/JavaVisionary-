package com.abhay;

import java.util.ArrayList;

//Btw these have to be imported.
public class Arraylists {
    public static void main(String[] args){
        //ArrayLists == basically a resizable array.

        // A BETTER VERSION OF ARRAY AND LIKE A PYTHON LIST

        //It grows its size to accommodate new elements and shrinks the size when the elements are removed.
        // ArrayList internally uses an array to store the elements. Just like arrays, It allows you to retrieve the elements by their index.
        // ONLY STORES REFERENCE DATA TYPES
        //-=========-=-=-=-=

        //Since we can only use reference data types in arraylists, If we need to use primitive shit...
        //We need to use a wrapper class and not a regular int type.
        //ArrayList<int> === this would give you an error since it cant be held.
        //ArrayList<Integer> == this is correct/==//==/

        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Hamburger");
        food.add("SPinach");
        //With ArrayLists we use .size instead of .length
        for(int i = 0; i <= food.size(); i++ ){
            //.get helps retrieve the element of the ArrayList
            System.out.println(food.get(i));
        }
        //Some useful methods of the ArrayList Class lol....

        //food.set(0, "sushi");
        //the 0 is the element and the sushi is the value we need to replace it with
        //food.remove(2);
        //food.clear();
    }
}
