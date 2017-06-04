
/**
 	 * Created by christopherorlik on 11/11/16.
	 * CMSC 1513
	 * Program simulates a single player game of craps
	 */

public class Craps {
	    // create main method
	    public static void main(String[] args) {

	        // create variable based on method that fetches random dice roll sum
	        int dice = rolledDice();

	        // tests for win after first roll
	        if (dice == 7 || dice == 11) {
	            System.out.println("You win!");
	            System.exit(0);
	        }
	        // tests for lose after first roll
	        else if (dice == 2 || dice == 3 || dice == 12){
	            System.out.println("You lose.");
	            System.exit(0);
	        }
	        // creates variable point and prints such pont if additional rolls are needed
	        int pointEstablished = dice;
	        System.out.println("Point is " + dice);

	        // runs the dice method until point or seven is rolled
	        do {
	            dice = rolledDice();
	        }
	        while (dice != 7 && dice != pointEstablished);
	       // prints for loser
	        if (dice == 7){
	            System.out.println("You lose.");
	        }
	        // prints for winner
	        else{
	            System.out.println("You win!");
	        }


	    }
	    // method created to return sum of two random dice rolls between 1 & 6
	    public static int rolledDice() {
	        int d1 = 1 + (int)(Math.random() * 6);
	        int d2 = 1 + (int)(Math.random() * 6);

	        System.out.println("You rolled " + d1 + " and " + d2 + " = " + (d1 + d2));
	        return d1 + d2;
	    }

	}
