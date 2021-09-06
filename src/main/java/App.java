/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner; //Using class scanner

public class App {

    public static void main(String[] args) {
        // main method begins execution of Java application
        Scanner input = new Scanner(System.in); //Scanner to obtain input
        System.out.println("What is the input String? ");
        String string = input.nextLine();   //Reads the string from the user

        int Length = string.length();   //get the length of string
        if (string.isEmpty())   //using if condition that if the user inputs nothing
        {
            System.out.println("Must enter something to count the string!"); //this message will be displayed
        }
        else
        {
            //display the string store in object string and also displays the length of the string
            System.out.println(string + " has " + Length + " characters. ");
        }

    }
}
