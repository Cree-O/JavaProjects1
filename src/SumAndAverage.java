import java.util.Scanner;

/**
 * Created by christopherorlik on 10/9/16.
 * CMSC 1513
 * Program takes the sum and average of user input using loops and booleans
 */
public class SumAndAverage {
    public static void main(String[] args) {

        // Create a new scanner object
        Scanner numbersScanner = new Scanner(System.in);

        // Request input
        System.out.print("Enter an interger, the input ends if it is zero:");

        // Collect user input
        int inputValues = numbersScanner.nextInt();

        // Assign initial constant values
        double sum = 0;
        int counter = 1;
        int positiveIntegerCount = 0;
        int negativeIntegerCount = 0;
        double average = 0.0;

        // Executes if integer is not 0
        while(inputValues != 0) {

            // Executes if integer is positive
            if (inputValues > 0){

                positiveIntegerCount++;

                // Addition of values
                sum = sum + inputValues;

                // Average of values
                average = (((int)(((sum / counter) * 100)))/100.0);

                System.out.print("Enter an interger, the input ends if it is zero:");

                inputValues = numbersScanner.nextInt();
            }
            //Executes if integer is positive
            else if (inputValues < 0){

                negativeIntegerCount++;

                // Addition of values
                sum = sum + inputValues;

                // Average of values
                average = (((int)(((sum / counter) * 100)))/100.0);

                System.out.print("Enter an interger, the input ends if it is zero:");

                inputValues = numbersScanner.nextInt();
            }

            counter++;
        }

        // Prints results after 0 is entered
        System.out.print("The number of positives is " + positiveIntegerCount +
        "\n The number of negatives is " + negativeIntegerCount +
        "\n The total is " + sum +
        "\n The average is " + average);
    }
}
