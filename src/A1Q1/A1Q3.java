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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Create a variable for the ticket price
        double ticket = 35;

        // Get numbers from the user
        System.out.println("How much money was spent on food?");
        double food = input.nextDouble();
        System.out.println("How much money was spent on the DJ?");
        double dj = input.nextDouble();
        System.out.println("How much money was spent on hall rental?");
        double hall = input.nextDouble();
        System.out.println("How much money was spent on decorations?");
        double decorations = input.nextDouble();
        System.out.println("How much money was spent on the wait staff?");
        double staff = input.nextDouble();
        System.out.println("How much money was spent on miscellaneous expenses?");
        double expenses = input.nextDouble();

        // Calculate the Total
        double total = food + dj + hall + decorations + staff + expenses;

        // Calculate the number of tickets that need to be sold and round it up
        double sales = total / ticket;

        // Output these calculated values to the user
        System.out.println("The total amount of money spent was " + total);
        System.out.println("$" + sales + " tickets need to be sold to break even.");
        System.out.print("The total cost of the prom is $" + total + ". ");
        //find the number of ticket sales required to break even
        System.out.println(Math.ceil(total / ticket) + " tickets need to be sold to break even.");
    }
}
