package com.abhay;

public class MultidimensionalArrays {
    public static void main(String[] args){
        //Basically a an array of arrays
        //here we are saying that a String of a 2d array called cars is created and they both have 3 elements each (but remember the numbers will only go up to 2 because java starts at zero).
        // The most easiest way to think about this is with columns and rows like a table.
        String[][] cars = new String[3][3];

        cars[0][0] = "Tesla";
        cars[0][1] = "Buick";
        cars[0][2] = "Camaro";
        cars[1][0] = "Silverado";
        cars[1][1] = "Mustang";
        cars[1][2] = "Ranger";
        cars[2][0] = "Lambo";
        cars[2][1] = "F-150";
        cars[2][2] = "Ferrari";
        //all of the numbers are in the sense...columns and rows. cars[(row...)2][(column...) 1]
        //...Hence it would take us to row 2, column 1
        //now we have to use a for loop to structurally display this.

        //the outer for loop to manage rows
        //inner loop for columns
        for(int i = 0; i<cars.length; i++){
            System.out.println();
            //below we will define j = 0; ...
            // Back up in the first for loop we made i = to index of the rows. So when we say length of i we mean that j will continue until the length of the row we are currently on.
            //Genius
            for(int j = 0; j<cars[i].length;j++){
                System.out.println(cars[i][j] + " ");
                //We print the i and the j because they are the rows and the columns
            }
        }
    }
}
