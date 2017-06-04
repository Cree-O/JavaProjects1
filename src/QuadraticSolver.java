import javax.swing.JOptionPane;

/**
 * Created by christopherorlik on 9/25/16.
 * CMSC 1513 Beginnning Programming
 * Solves Quadratic Equations for Real Roots by obtaining input from user for values a, b, and c.
 */
public class QuadraticSolver {

    // Declare main method
    public static void main(String[] args) {

        // Prompt user for string values a, b, and c
        String stringA = JOptionPane.showInputDialog(null, "Enter value for a: ");
        String stringB = JOptionPane.showInputDialog(null, "Enter value for b");
        String stringC = JOptionPane.showInputDialog(null, "Enter value for c");

        // Parse string values into doubles
        double aValue = Double.parseDouble(stringA);
        double bValue = Double.parseDouble(stringB);
        double cValue = Double.parseDouble(stringC);

       boolean hasRealRoots = ((Math.pow(bValue, 2.0)) - 4 * aValue * cValue) > 0;

        // Executes if true
        if(hasRealRoots) {

            // Formula for the roots of the quadratic equation
            double rootOne = (((-bValue) + (Math.pow(((Math.pow(bValue, 2.0)) - 4 * aValue * cValue), .5))) / (2 * aValue));
            double rootTwo = (((-bValue) - (Math.pow(((Math.pow(bValue, 2.0)) - 4 * aValue * cValue), .5))) / (2 * aValue));

            // Displays the two real roots
            JOptionPane.showMessageDialog(null, "The equation has two roots " + rootOne + " and " + rootTwo);

            // Executes if false
        } else if (!hasRealRoots){

            // Boolean is true if there is one real root for the equation
            boolean hasOneRoot = ((Math.pow(bValue, 2.0)) - 4 * aValue * cValue) == 0;

                // Executes if first boolean is false and second boolean is true
                if (hasOneRoot){

                    // Formula for the single real root
                    double singleRoot = ((-bValue)) / (2 * aValue);

                    // Displays the single real root
                    JOptionPane.showMessageDialog(null, "The equation has one root " + singleRoot);

                // Executes if first boolean if false and second boolean is not true
                } else {

                    JOptionPane.showMessageDialog(null, "The equation has no real roots.");

                }
        }
    }
}

