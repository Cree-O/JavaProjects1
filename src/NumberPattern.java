

import javax.swing.JOptionPane;

/**
 * Created by christopherorlik on 11/6/16.
 * CMSC 1513
 * 
 * This program is supposed to collect user input of integer and create the pattern with numbers
 */
public class NumberPattern {
    public static void main(String[] args) {
    	// numberpattern main
        // Obtain input
        String nString = JOptionPane.showInputDialog(null, "Enter an integer to create pattern:");
        int n = Integer.parseInt(nString);


        displayPattern(n);
    }

    public static void displayPattern(int n) {

    String numberString = "\n";

        //row iterations
        for (int row = n; row >= 1; row--) {

            int origN = n;
            // Supposed to add spaces to align numbers to the right
            for (int rowCount = 1; rowCount > (origN-(origN-1)); rowCount++) {
                numberString = "  " + numberString;
            }
                // each row of numbers
                for (int i = 1; i <= n; i++) {

                    numberString = i + " " + numberString;
                }
                // decrease n for next row and jump to new line
                n--;
                numberString = "\n" + numberString;

            }
        // Print out message
        JOptionPane.showMessageDialog(null, numberString);
        }


    }

