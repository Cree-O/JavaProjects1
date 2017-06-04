 import java.util.Scanner;

/**
 * Created by christopherorlik on 9/26/16.
 * CMSC 1513 Beginning Programming
 * Program runs rock paper scissor game by randomly generating rock paper or scissor for the computer vs user input
 */
public class RockPaperScissor {

    // Declare main method
    public static void main(String[] args){

        // Create a new scanner object
        Scanner userSelection = new Scanner(System.in);

        // Prompt user to make selection
        System.out.print("scissor (0), rock (1), paper (2): ");

        // Define the number
        int selection = userSelection.nextInt();

        // Generate random number for computer
        int n = (int)(Math.random() * 2);

        // Output for possible outcomes
        if ((n == selection) && (n == 0)) {
            System.out.print("The computer is scissor. You are scissor too. It is a draw ");

        }   else if ((n == selection) && (n == 1)){
            System.out.print("The computer is rock. You are rock. It is a draw");
        }   else if ((n == selection) && (n == 2)){
            System.out.print("The computer is paper. You are paper. It is a draw");
        }   else if ((n == 0) && (selection == 1)){
            System.out.print("The computer is scissor. You are rock. You win");
        }   else if ((n == 0) && (selection == 2)){
            System.out.print("The computer is scissor. You are paper. You lose");
        }   else if ((n == 1) && (selection == 0)){
            System.out.print("The computer is rock. You are scissor. You lose");
        }   else if ((n == 1) && (selection == 2)){
            System.out.print("The computer is rock. You are paper. You win");
        }   else if ((n == 2) && (selection == 0)){
            System.out.print("The computer is paper. You are scissor. You win");
        }   else if ((n == 2) && (selection == 1)){
            System.out.print("The computer is paper. You are rock. You lose");
        }


    }

}



