
import java.util.*;   //--- Import the Scanner and PrintWriter classes from the java.util and java.io packages

 // Question 5 - Palindrome Check

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String text = input.nextLine().toLowerCase(); // lowercase everything so case is ignored

        boolean isPalindrome = true;
        int start = 0;
        int end = text.length() - 1;

        while (start < end) { // move inwards from both ends at once
            if (text.charAt(start) != text.charAt(end)) { // characters don't match
                isPalindrome = false;
                break;
            }
            start++; // move the front pointer forward
            end--;   // move the back pointer backward
        }

        if (isPalindrome) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }

        input.close();
    }
}




