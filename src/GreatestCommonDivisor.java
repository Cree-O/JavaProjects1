import javax.swing.JOptionPane;

/**
 * Created by christopherorlik on 10/22/16.
 * CMSC 1513
 * Program finds greatest common divisor of two posititve integers
 */
public class GreatestCommonDivisor {
    public static void main(String[] args){

    // Prompt user for two positive integers
        String number1String = JOptionPane.showInputDialog("Enter first integer");
        String number2String = JOptionPane.showInputDialog("Enter second integer");

        int number1 = Integer.parseInt(number1String);
        int number2 = Integer.parseInt(number2String);

        // Sets actual and possible GCD to 1 until further iterations
        int gcd = 1;
        int possibleGCD = 1;

        while (possibleGCD <= number1 && possibleGCD <= number2){

            // update GCD value
            if (number1 % possibleGCD == 0 && number2 % possibleGCD ==0){
                gcd = possibleGCD;
            }
            // increase possible GCD until it reaches the limit of an input integer
            possibleGCD++;
        }
        JOptionPane.showMessageDialog(null, "The greatest common divisor for " +
        number1 + " and " + number2 + " is:\n " + gcd);

    }
}
