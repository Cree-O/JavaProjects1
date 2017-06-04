import java.util.Scanner;

/**
 * Created by christopherorlik on 11/5/16.
 * CMSC 1513
 * This program obtains an integer input and determine if it is a palindrome and reverses the number
 */
public class PalindromeInteger {
    public static void main (String[] args){
        // Obtain input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int number = input.nextInt();
        String reverseNumberString = "The reversal of the integer is: " + reverse(number) + "\n";
        System.out.print(reverseNumberString);
        String palindromeResult = "The number is a palindrome: " + isPalindrome(number);
        System.out.print(palindromeResult);

    }
    // Create method to test for palindrome
    public static boolean isPalindrome(int num) {
        boolean result;
        if (num == reverse(num)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    // Create method to inverse the input number
    public static int reverse(int number) {
        int remainder;
        int reverse = 0;
        while (number != 0) {
            remainder = number % 10;
            number = number / 10;
            reverse = reverse * 10 + remainder;
        }
        return reverse;
    }

}

