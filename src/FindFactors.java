import javax.swing.JOptionPane;

/**
 * Created by christopherorlik on 10/10/16.
 * CMSC 1513
 * Program prints numbers divisible by 5 & 6 in the range of 100-1000 and prints at 10 values per line
 */
public class FindFactors {
    public static void main(String[] args){

        // Define variable for amount of numbers divisible
        int count = 0;

        // Create string to print out
        String factorableNumbers = "Numbers Divisible by 5 & 6 (range 100-1,000):\n\t_________________________________________\n ";

            // Define the range of the number to be considered
            for (int numbersCounter = 100; (numbersCounter < 1000); numbersCounter++){

                    // Determine if numbers are divisible by 5 & 6 and if so add one to the count variable
                    if ((numbersCounter % 5 == 0) && (numbersCounter % 6 == 0)) {

                        // Add new number to the string
                        factorableNumbers = factorableNumbers + " " + numbersCounter;

                        // Add one to the count
                        count++;
                    }
                // Add a new line to the string every time the count reaches 10 and then reset count
                if (count == 10) {
                    factorableNumbers = factorableNumbers + "\n\t";
                    count = 0;
                }
            }

        // Print the goods
        JOptionPane.showMessageDialog(null, factorableNumbers);

        }


}

