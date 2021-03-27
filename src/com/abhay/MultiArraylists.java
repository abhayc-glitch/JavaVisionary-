package com.abhay;

import java.util.ArrayList;

public class MultiArraylists {
    public static void main(String[] args){
        // 2d ArrayList == a list of lists (arraylists)
        //you can change the size of these lists during runtime.

        ArrayList<ArrayList<String>> grocery = new ArrayList();
        ArrayList<String> bakerylist = new ArrayList();
        bakerylist.add("pasta");
        bakerylist.add("Garlic Bread");
        bakerylist.add("Donuts");

        ArrayList<String> producelist = new ArrayList();
        producelist.add("tomatoes");
        producelist.add("zucchini");
        producelist.add("peppers");

        ArrayList<String> drinkslist = new ArrayList();
        drinkslist.add("soda");
        drinkslist.add("coffee");

        grocery.add(bakerylist);
        grocery.add(producelist);
        grocery.add(drinkslist);
        //(grocery.get(0).get(1)) there are 2 gets because of it being 2-d
        System.out.println(grocery.get(0).get(1));





    }
}
