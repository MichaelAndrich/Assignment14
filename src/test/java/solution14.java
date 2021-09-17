/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Michael Andrich
 */
/*
    prompt user for the order amount
    prompt user for which state
    output the subtotal
    output the tax if applicable
    output the total



 */


import java.util.Scanner;

public class solution14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the order amount? ");
        String num1 = sc.nextLine();
        double P = Double.parseDouble("" + num1);

        System.out.println("What is the state? ");
        String state = sc.nextLine();

        System.out.println("The subtotal is $"+(P)+".");

        if(state.toLowerCase().equals("wi")){
            double tax = P * 0.055;
            System.out.println("The tax is $"+(tax)+".");

            double total = tax + P;
            System.out.println("The total is $"+(total)+".");
        }



    }
}