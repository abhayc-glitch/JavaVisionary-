package com.abhay;
import java.util.Random;
public class randomNumbers {
    public static void main(String[] args){
        //We need an instance so we use the class...
        Random random = new Random();
        int x = random.nextInt(5) + 1;
        // (5)+1 means in between 1 and 5. (random.randint(1,5))
        double y = random.nextDouble();
        boolean z = random.nextBoolean();
        //gonna return either a true or false
        System.out.println(z);
    }    
}
