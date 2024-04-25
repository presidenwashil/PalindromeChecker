package palindromechecker;

import java.util.Scanner;


public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //input word
        System.out.println("Input word: ");
        String word  = scanner.nextLine();
        
        //check if the word is palindrome
        boolean isPalindrome = checkPalindrome(word);
        
        //print result
        if (isPalindrome) {
            System.out.println(word + " is Palindrome");
        } else {
            System.out.println(word + " not Palindrome");
        }
    }
    
    
    //create checkPalindrome method for decide if it is a palindrome word
    public static boolean checkPalindrome (String word){
        int left = 0; //first index
        int right = word.length() - 1; //last index
        
        //loop for compare the char on the first and last index
        while (left < right){
            //if char on left index and right index not same then its not a palindrome
            if(word.charAt(left) != word.charAt(right)) {
                return false;
            }
            // update left and right index
            left++;
            right--;
        }
        
        //if char suitable, then it should be palindrome word
        return true;
    }
}
