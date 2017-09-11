/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A1Q1;

import java.util.Scanner;

/**
 *
 * @author bonsk5852
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Create a variable to count the number of years
        int years = 0;
        // Create a variable for the amount of money and get the amount from the user
        System.out.println("Enter the initial amount of money in your savings account");
        double amount = input.nextDouble();
        // Create a variable for the final amount which is double the initial amount
        double finalamount = amount * 2;

        // Create a variable for the interest rate and get it from the user
        System.out.println("Enter the interest rate as a decimal");
        double rate = 1 + input.nextDouble();

        // Calculate the total amount of money the user would have each year until it doubles
        while (amount < finalamount) {
            amount = amount * rate;
            years = years + 1;
        }
        // Output the number of years
        System.out.println("It would take " + years + " years for the initial amount of money to double.");
    }
}
