/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A1Q1;

/**
 *
 * @author bonsk5852
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create variables for the population, year and rate of increase
        double start = 6;
        int year = 1999;
        double rate = 1.014;
        System.out.println("The population of the world in 1999 was " + start);

        // Increase the year and Population every year and output the results
        while (start < 10) {
            start = start * rate;
            year = year + 1;
            System.out.println("In the year " + year + ", the estimated population is " + start + " billion.");
        }
    }
}
