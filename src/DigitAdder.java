import java.util.Scanner;

/**
 * Created by christopherorlik on 9/19/16.
 * Intro to Programming CMSC 1513
 * Project 3.b
 * Project sums the integers of the input value from the console using scanner and division
 * and remainder operators
 */
// Declare class
public class DigitAdder {

    // Declare main method
    public static void main(String[] args) {

        // Creates a new scanner object
        Scanner inputvalue = new Scanner(System.in);

        // Prompt user to input a value
        System.out.print("Enter a number between 0 and 1000: ");

        // Number is defined variable as console inputvalue
        int number = inputvalue.nextInt();

        // Isolate digits and assign to a variable
        int thirdDigit = number % 10;
        int digitsOneAndTwo = number / 10;
        int secondDigit = digitsOneAndTwo % 10;
        int firstDigit = digitsOneAndTwo / 10;

        // Sum digits
        int sum = thirdDigit + secondDigit + firstDigit;

        // Display results
        System.out.print( "The sum of the digits is " + sum);



    }
}
