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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Create variables for the word and create a counter
        String word = "String";
        int counter = 0;

        // Create a loop in which the user can enter words. Once the word entered is "exit" break the loop
        System.out.println("Enter words. Enter 'exit' to stop the loop");
        while (!word.equals("exit")) {
            word = input.nextLine();
            counter = counter + 1;
        }
        // Output the number of words counted
        System.out.println("There were " + (counter - 1) + " words entered before exit");

    }
}
