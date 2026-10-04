import java.util.*;  // Imports ArrayList, HashMap, Scanner, etc.

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//--- Create a Scanner object to read user input (which is a score that represents a student's score)
        int score;
        while (true) {
            System.out.print("Enter a score (0-100): ");//--- Prompt the user to enter a score that represents a student's score (0-100)
            if (input.hasNextInt()) {
                score = input.nextInt();
                if (score >= 0 && score <= 100) break;
                System.out.println("NOOO that's not valid: must be between 0 and 100."); // --- funny response if the user input is not a valid integer, print an error message and prompt again
            } else {
                System.out.println("Invalid: must be a positive integer Dude!.");// ---funny response if the user input is not a valid integer, print an error message and prompt again
                input.next();
            }
        }
        String grade;// --- Declare a variable to hold the grade (A, B, C, D, or F) based on the score
        if (score >= 80) grade = "A";
        else if (score >= 70) grade = "B";else if (score >= 60) grade = "C"; else if (score >= 50) grade = "D"; else grade = "F";// --- Use if-else statements to determine the grade based on the score

        System.out.print("your grade is " + grade);// --- Print the grade to the console
        input.close();
    }
}