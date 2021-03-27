package com.abhay;

public class overloadedMethods {
    public static void main(String[] args){
        //overloaded methods == methods that share the same name but have the different parameters
        //method name + parameters = method signature.
        double sol = add(1.0,2.0, 4.0563, 3.37262);
        System.out.println(sol);

    }
    static int add(int x , int y){
        System.out.println("This is overloaded Method one");
        return x+y;
    }
    static int add(int x , int y, int z){
        System.out.println("This is overloaded Method two");
        return x+y+z;
    }
    static double add(double x , double y){
        System.out.println("This is overloaded Method 3");
        return x+y;
    }
    static double add(double x , double y, double z){
        System.out.println("This is overloaded Method 4");
        return x+y+z;
    }    static double add(double x , double y, double z, double a){
        System.out.println("This is overloaded Method five");
        return x+y+z+a;
    }
    static double add(double x , double y, int z){
        System.out.println("This is overloaded Method 6");
        return x+y+z;
    }
}
