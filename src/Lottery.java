import java.util.Random;

import javax.swing.JOptionPane;

/**
 * Created by christopherorlik on 9/30/16.
 * CMSC 1513 Project 5 Lottery
 * Randomly generated lottery (three digits) compared to user input pick (three digits)
 * 10/5/2016
 */
public class Lottery {
    public static void main(String[] args) {

        // Introduce new random
        Random rand = new Random();

        // Generate a lottery number
        int lottery = rand.nextInt(900) + 100;

        // Define input lottery pick as a string
        String threeDigitString = JOptionPane.showInputDialog(null, "Enter your lottery pick (three digits): ");

        // Parse string into integer
        int lotteryPick = Integer.parseInt(threeDigitString);

        // Parse string into integer
        int u1 = lotteryPick / 100;
        int temp2 = lotteryPick / 10;
        int u2 = temp2 % 10;
        int u3 = lotteryPick % 10;

        // Get digits from lottery
        int l1 = lottery / 100;
        int lotteryDigit2Temp = lottery / 10;
        int l2 = lotteryDigit2Temp % 10;
        int l3 = lottery % 10;

        // Print lottery number
        JOptionPane.showMessageDialog(null, "The lottery number is " + lottery);
        // Check the guess
        // If all digits match in same order
        if ((l1 == u1) && (l2 == u2) && (l3 == u3)) {
            JOptionPane.showMessageDialog(null, "Exact match: you win $10,000!");

            // If all digits match
        } else if (((u1 == l1) && (u2 == l2) && (u3 == l3)) ||
                ((u1 == l1) && (u2 == l3) && (u3 == l2)) ||
                ((u1 == l2) && (u2 == l1) && (u3 == l3)) ||
                ((u1 == l2) && (u2 == l3) && (u3 == l1)) ||
                ((u1 == l3) && (u2 == l1) && (u3 == l2)) ||
                ((u1 == l3) && (u2 == l2) && (u3 == l1)) ||

                (((u2 == l1) && (u1 == l2) && (u3 == l3)) ||
                        ((u2 == l1) && (u1 == l3) && (u3 == l2)) ||
                        ((u2 == l2) && (u1 == l1) && (u3 == l3)) ||
                        ((u2 == l2) && (u1 == l3) && (u3 == l1)) ||
                        ((u2 == l3) && (u1 == l1) && (u3 == l2)) ||
                        ((u2 == l3) && (u1 == l2) && (u3 == l1)) ||

                        (((u3 == l1) && (u2 == l2) && (u1 == l3)) ||
                                ((u3 == l1) && (u2 == l3) && (u1 == l2)) ||
                                ((u3 == l2) && (u2 == l1) && (u1 == l3)) ||
                                ((u3 == l2) && (u2 == l3) && (u1 == l1)) ||
                                ((u3 == l3) && (u2 == l1) && (u1 == l2)) ||
                                ((u3 == l3) && (u2 == l2) && (u1 == l1))))) {

            JOptionPane.showMessageDialog(null, "Match all digits: you win $3,000!");

            // If two digits match
        } else if (((u1 == l1) && ((u2 == l2) ^ (u3 == l3))) ||
                ((u1 == l1) && ((u2 == l3) ^ (u3 == l2))) ||
                ((u1 == l2) && ((u2 == l1) ^ (u3 == l3))) ||
                ((u1 == l2) && ((u2 == l3) ^ (u3 == l1))) ||
                ((u1 == l3) && ((u2 == l1) ^ (u3 == l2))) ||
                ((u1 == l3) && ((u2 == l2) ^ (u3 == l1))) ||

                (((u2 == l1) && ((u1 == l2) ^ (u3 == l3))) ||
                        ((u2 == l1) && ((u1 == l3) ^ (u3 == l2))) ||
                        ((u2 == l2) && ((u1 == l1) ^ (u3 == l3))) ||
                        ((u2 == l2) && ((u1 == l3) ^ (u3 == l1))) ||
                        ((u2 == l3) && ((u1 == l1) ^ (u3 == l2))) ||
                        ((u2 == l3) && ((u1 == l2) ^ (u3 == l1))) ||

                        (((u3 == l1) && ((u2 == l2) ^ (u1 == l3))) ||
                                ((u3 == l1) && ((u2 == l3) ^ (u1 == l2))) ||
                                ((u3 == l2) && ((u2 == l1) ^ (u1 == l3))) ||
                                ((u3 == l2) && ((u2 == l3) ^ (u1 == l1))) ||
                                ((u3 == l3) && ((u2 == l1) ^ (u1 == l2))) ||
                                ((u3 == l3) && ((u2 == l2) ^ (u1 == l1)))))) {
            JOptionPane.showMessageDialog(null, "Match two digits: you win $2,000!");

            // If one digits match
        } else if (((u1 == l1) || (u1 == l2) || (u1 == l3)) ||
                ((u2 == l1) || (u2 == l2) || (u2 == l3)) ||
                ((u3 == l1) || (u3 == l2) || (u3 == l3))) {
            JOptionPane.showMessageDialog(null, "Match one digits: you win $1,000!");

        } else {
            JOptionPane.showMessageDialog(null, "Sorry, no match");
        }


    }

}
