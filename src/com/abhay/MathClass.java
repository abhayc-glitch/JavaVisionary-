package com.abhay;
import java.util.Scanner;
public class MathClass {
    public static void main(String[] args) {
        //Max method finds the larger of the two(Math.max)
        //Min method finds the lesser of the two(Math.min)
        //Abs method gives you the the Absolute Value(Math.abs)
        //Sqrt Method finds the square root of the number(Math.Sqrt)
        //Round Method rounds the number to the closest whole number.(Math.Round)
        //Ceil Method rounds the number UP.(Math.Ceil)
        //Floor Method rounds the number Down.(Math.Floor)

        Scanner scanner = new Scanner(System.in);


        //----------------
        //Program to find out the hypotenuse of a triangle
        //a^2 + b^2 =c^2
        // MY CODE-------------------------_________________________

        System.out.println("Enter aide a: ");
        double x = scanner.nextDouble();

        System.out.println("Enter side b: ");
        double y = scanner.nextDouble();

        //double x = a * a;
        //double y = b * b;
        //double temp = x+y;
        //double c = Math.sqrt(temp);
        //System.out.println("The Hypotenuse is "+c);
        //__________-------------_________
        //THIS METHOD IS WAY TO BIG NO NEED FOR THIS.
        double l = Math.sqrt((x * x) + (y * y));
        System.out.println("The Hypotenuse is " + l);
        scanner.close();
        //Its a good practice to close your scanner






    }
}
