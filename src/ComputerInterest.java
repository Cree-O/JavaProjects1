import java.util.Scanner;

/**
 * Created by christopherorlik on 10/22/16.
 * CMSC 1513
 * Prints out the monthly interest with principle each month over the maturity period
 */
public class ComputerInterest {
    public static void main(String[] args){

        // Create scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for initial deposit amount, percent yield, and maturity period
        System.out.print("Enter the initial deposit amount:");
        double initialDepositAmount = input.nextDouble();
        System.out.print("Enter the annual percentage yield:");
        double annualPercYield = input.nextDouble();
        System.out.print("Enter the maturity period (number of months):");
        int maturityPeriod = input.nextInt();

        /*
        Begin loop for months of interest calculated until CD has matured
         */
        for (int monthCount = 1; monthCount <= maturityPeriod; monthCount++ ){

            // Perform monthly interest yields
            initialDepositAmount = initialDepositAmount + initialDepositAmount * annualPercYield / 1200;

            // Perform first iteration of system out description of values
            if (monthCount == 1){
                System.out.print("Month   CD Value");
            }
            // Prints out the monthly interest with principle
            System.out.print("\n" + monthCount + "        " + (int)(initialDepositAmount * 100) / 100.00);

        }

    }
}
