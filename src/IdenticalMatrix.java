import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * Created by christopherorlik on 11/20/16.
 * CMSC 1513
 * This program receiveds input of two two-dimensional matrices and then compares for equality
 */
public class IdenticalMatrix {
    public static void main(String[] args) {

        // Create user input string for matrix one and two
        String m1String = JOptionPane.showInputDialog(null, "Enter list1 (9 integers separated by a space): ");
        String m2String = JOptionPane.showInputDialog(null, "Enter list2 (9 integers separated by a space): ");

        // Split the strings at " "
        String[] number1Strings = m1String.split(" ");
        String[] number2Strings = m2String.split(" ");

        // Create the two matrices
        int[] m1Values = new int[number1Strings.length];
        int[] m2Values = new int[number2Strings.length];
        int row = 3;
        int column = 3;
        int[][] m1 = new int[row][column];
        int[][] m2 = new int[row][column];

        // Parse the strings into a single int array
        for (int i = 0; i < number1Strings.length; i++) {
            m1Values[i] = Integer.parseInt(number1Strings[i]);
            m2Values[i] = Integer.parseInt(number2Strings[i]);
        }

        // Assign the single int array into a the two-dimensional arrays
        int indexCount = 0;
        for (row = 0; row < 3; row++) {
            for (column = 0; column < 3; column++) {
                m1[row][column] = m1Values[indexCount];
                m2[row][column] = m2Values[indexCount];
                indexCount++;

            }
        }
        // Convert the arrays back into a single dimension array
        int[] m1singleDimension = new int[row * column];
        int[] m2singleDimension = new int[row * column];
        int a = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1singleDimension[a] = m1[i][j];
                m2singleDimension[a] = m2[i][j];
                a++;
            }
        }
        // Sort the arrays
        Arrays.sort(m1singleDimension);
        Arrays.sort(m2singleDimension);

        // Pass the two arrays into the method to test for equality
        equals(m1, m2);

        // Print results
        if(equals(m1, m2) == true){
            JOptionPane.showMessageDialog(null, "The two inputs are identical.");
        }
        else{
            JOptionPane.showMessageDialog(null, "The two inputs are not identical.");
        }

    }
    // Create a method that return true if the two-dimensional arrays are equal
    private static boolean equals(int[][] m1, int[][] m2) {
        int[] m1singleDimension = new int[3 * 3];
        int[] m2singleDimension = new int[3 * 3];
        int a = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1singleDimension[a] = m1[i][j];
                m2singleDimension[a] = m2[i][j];
                a++;
            }
        }
        Arrays.sort(m1singleDimension);
        Arrays.sort(m2singleDimension);
        if(Arrays.equals(m1singleDimension, m2singleDimension)){
            return true;
        }
        return false;}

}
