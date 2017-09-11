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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Create an array
        String words[] = new String[10];
        // Get 10 words from the user and put them in the array
        System.out.println("Please input 10 words");
        for (int i = 0; i < words.length; i++){
            words[i] = input.nextLine();
        }
        // Create a variable for the total number of characters in all the words
        int total = 0;
        // Find the total number of characters in all the words
        for(int i = 0; i <words.length; i++){
            total = total + words[i].length();
        }
        System.out.println("The total number of characters in all the words is " + total + ".");
        
        // Divide it by the number of words to calculate the average and output the result
        double average = total/words.length;
        System.out.println("The average length is " + average);
    }
}
