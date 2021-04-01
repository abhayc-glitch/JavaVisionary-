package com.abhay;

import java.util.Random;

public class DiceRoller {
    //defining the variable outside the method and in the class.
    int number;
    DiceRoller(){
        Random random = new Random();
        int number  = 0;
        returnRoll(random);
    }
    void returnRoll(Random random){
        //plus one cuz we will get values from 0-5
        int number = random.nextInt(6) + 1;
        System.out.println(number);
    }
    // what we did above was since ReturnRoll couldn't access the DIceRoller Method(it still counts.) so we just called it in as a parameter.
    // we can make it better my defining a GLOBAL variable.
}
