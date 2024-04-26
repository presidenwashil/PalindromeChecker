package palindromechecker;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Keep the program running in a loop
        while (true) {
            // Prompt the user to enter a word
            System.out.println("Input word: ");
            String word = scanner.nextLine();
            
            // Check if the word is a palindrome
            boolean isPalindrome = checkPalindrome(word);
            
            // Print the result
            if (isPalindrome) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
            
            // Ask the user if they want to check another word
            System.out.println("Do you want to check another word? (yes/no)");
            String response = scanner.nextLine();
            
            // If the user does not want to continue, break the loop
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }
        
        // Close the scanner
        scanner.close();
        
        // Print a farewell message
        System.out.println("Thank you for using the Palindrome Checker. Goodbye!");
    }
    
    // Method to check whether a given word is a palindrome
    public static boolean checkPalindrome(String word) {
        int left = 0; // First index
        int right = word.length() - 1; // Last index
        
        // Loop to compare characters from the start and end of the word
        while (left < right) {
            // If characters at left and right indices are not the same, it's not a palindrome
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            // Update left and right indices
            left++;
            right--;
        }
        
        // If all characters match, the word is a palindrome
        return true;
    }
}
