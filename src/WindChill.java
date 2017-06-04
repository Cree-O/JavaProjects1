import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JOptionPane;

/**
 * Created by christopherorlik on 9/19/16.
 * Intro to Programming CMSC 1513
 * Project 3.a
 * Program receives input using JOptionPane and Scanner input to compute the windchill temperature
 */
// Declare class
public class WindChill {

    // Declare main method
    public static void main(String[] args) {

        // Declare variables
        String firstNumber;
        String secondNumber;

        double number1;     // Temperature value
        double number2;     // Wind Speed value
        double windChill;   // Result of Equation


        // Prompt user to input temperature
        firstNumber = JOptionPane.showInputDialog("Enter the temperature in Farenheit between -58F and 41F:");

        // Prompt user to input windspeed to assign to String y
        secondNumber = JOptionPane.showInputDialog("Enter the wind speed >=2 in miles per hour:");

        // Convert numbers of type string to type double
        number1 = Double.parseDouble(firstNumber);
        number2 = Double.parseDouble(secondNumber);

        // Compute Windchill temperature
        windChill = (35.74 + .6215 * number1) - (35.75 * Math.pow(number2, .16)) +
                .4275 * number1 * Math.pow(number2, .16);

        // Remove decimals to the hundredths
        windChill = ((int)(windChill * 100))/100.0;

        //Display Windchill
        showMessageDialog(null, " The wind chill index is: " + windChill + " F.", "Temperature", JOptionPane.PLAIN_MESSAGE);


    }
}
