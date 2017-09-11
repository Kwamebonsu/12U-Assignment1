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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Get a number from the user
        System.out.println("Please enter a number between 1 and 10");
        int number = input.nextInt();

        // If the number is not between 1 and 10 get a new number
        while (number < 1 || number > 10) {
            System.out.println("I said to enter a number BETWEEN 1 AND 10!!!");
            number = input.nextInt();
        }
        // If the number is between 1 and 10 then display the appropriate number asteriks amd rows
        if (number >= 1 && number <= 10) {
            for (int i = 0; i < number; i++) {
                for (int k = 0; k < number; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
