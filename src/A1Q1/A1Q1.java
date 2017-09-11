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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for their name
        System.out.println("Please enter your name");

        // Store the user's input as a string
        String name = input.nextLine();

        // Output the Hello NAME!
        System.out.println("Hello " + name + "!");
    }
}
