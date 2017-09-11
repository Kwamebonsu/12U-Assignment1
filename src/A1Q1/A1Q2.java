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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Create an array
        int[] numbers = new int[3];

        // Get 3 numbers from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please input " + (3 - i) + " number(s)");
            numbers[i] = input.nextInt();
        }
        // Create a variable to find the the product
        int product = 1;

        // Calculate the square and the square root of the product and output it
        for (int i = 0; i < numbers.length; i++) {
            product = numbers[i] * product;
        }
        System.out.println("The product of these numbers is " + product);
        double square = Math.pow(product, 2);
        double squareroot = Math.sqrt(product);

        System.out.println("The square of the  product is " + square);
        System.out.println("The square root of the product is " + squareroot);
    }
}
