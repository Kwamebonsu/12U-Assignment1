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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        int hundred = 100;
        // Get a number from the user
        System.out.println("Please enter a number between 50 and 100.");
        int number = input.nextInt();

        while (number < 50 || number > 100) {
            System.out.println("I said to enter a number BETWEEN 50 AND 100!!!");
            number = input.nextInt();
        }
        // Subtract 5 from 100 until the next number is going to be less than the inputted number.
        while (hundred >= number) {
            System.out.println(hundred);
            hundred = hundred - 5;
        }
    }
}
