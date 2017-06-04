import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by christopherorlik on 11/16/16.
 * CMSC 1513 INTRO TO JAVA
 * This program receives user input via scanner to order students in descending order of their grades
 */
public class StudentSorter {
    public static void main(String[] args){

        // Intialize scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students:");

        //Collect the input of number of students
        int numStudents = scanner.nextInt();

        // Create arrays for student names and scores each
        String [] arrayNames = new String[numStudents];
        int [] arrayScores = new int [numStudents];

        // Iterate over the arrays for how many students there are
        for(int i = 0; i < numStudents; i++){
            System.out.print("Enter the student name: ");
            arrayNames[i] = scanner.next();
            System.out.print("Enter the student score: ");
            arrayScores[i] = scanner.nextInt();
        }

        // Initialize sortSelection method
        sortSelection(arrayNames, arrayScores);
        // Print names in descending score order
        System.out.println(Arrays.toString(arrayNames));
    }
    // Create method to sort the students by grade descending
    public static void sortSelection(String arrayNames [], int arrayScores []){
        // Create a count down for all the index spaces to be filled
        for(int i = arrayScores.length -1; i >= 1; i--){
            // Assign initial max and index of max to "0" and "0"
            int currentMax = arrayScores[0];
            int currentMaxIndex = 0;
            // Test current max against other values and assign new max to current max if condition is met
            for(int j = 1; j <= i; j++){
                if (currentMax > arrayScores[j]){
                    currentMax = arrayScores[j];
                    currentMaxIndex = j;
                }
            }
            // Move non-current max, score, and index value to the back of the two Strings as conditions are met
            if (currentMaxIndex != i){
                    String temp = arrayNames[currentMaxIndex];
                    arrayNames[currentMaxIndex] = arrayNames[i];
                    arrayNames[i] = temp;
                    arrayScores[currentMaxIndex] = arrayScores[i];
                    arrayScores[i] = currentMax;

            }
        }
    }
}