package com.abhay;

import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        //GUI - (gooey) Graphical User Interface
        // Also using message dialog boxes
        //We are using the JOptionPane class
        //JOptionPane is simple class used to make dialog boxes with simple messages and dialog and messages.

        String name = JOptionPane.showInputDialog("Enter your name. ");
        JOptionPane.showMessageDialog(null, "Hello "+name);
        //"JOptionPane.showInputDialog" is a visual version of Scanner to take input.
        //Now if we want to take the age of someone then we use int BUT we cant do it the way down below because the JOptionPane will return a string.
        //We cant assign a string variable to an INT.
        //int age  = JOptionPane.showInputDialog("Enter your age");---------------
        //we have to Parse it into a int just like the python == int("4")

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));
        JOptionPane.showMessageDialog(null,"You "+age+"?!?!??!. Damn you old...");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in CM"));
        JOptionPane.showMessageDialog(null, "Your Height is "+height+"cm.");
        //We need to parse again here because a "Double" value is numerical value.




    }
}
