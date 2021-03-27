package com.abhay;

public class Arrays {
    public static void main(String [] args) {
        //Array ==  an array data structure, or simply an array, is a data structure consisting of a collection of elements, each identified by at least one array index or key.
        //An array is stored such that the position of each element can be computed from its index tuple by a mathematical formula.
        // Equivalent to a list in Python
        String car = "Mustang";
        //above is hwo to initialize a basic string named car with the value of "Mustang"
        //To initialize an array...
        //MAIN THING TO REMEMBER IS THAT YOU CAN ONLY SPECIFY ONE DATA TYPE OF AN ARRAY.
        //Example == .....
        //String[] cars = {"mustang","corvette", "Tesla", 1232};
        // I cant say 123 because thats an int value.
        String[] cars = {"mustang","corvette", "Tesla"};
        //You can access the components of an array which are called elements, by reference number by there order.
        System.out.println(cars[0]);
        //Java starts at zero
        //This is one way to create a ray ====================================

        String[] careres = new String[3];
        // The array carers is tell us that we have 3 values in the array, careres.
        //we have to create those
        careres[0] = "Buick";
        careres[2] = "ASton martin";
        careres[1] = "Maserati";
        System.out.println(careres[2]);

        //using a for loop it iterate through all of the elements of the array
        for(int x =0; x<careres.length; x++) {
            System.out.println(careres[x]);
        }







    }

}
