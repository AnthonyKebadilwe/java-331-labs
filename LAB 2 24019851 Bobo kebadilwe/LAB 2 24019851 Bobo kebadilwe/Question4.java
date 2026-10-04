import java.io.*;
import java.util.*;   //--- Import the Scanner and PrintWriter classes from the java.util and java.io packages

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            PrintWriter pw = new PrintWriter("results.txt");// --- Open the file results.txt for writing
            for (int i = 1; i <= 5; i++) {
                String name;
                while (true) {
                    System.out.print("Enter name for student " + i + ": ");// --- Prompt the user to enter the name of the student
                    name = input.nextLine();
                    if (!name.trim().isEmpty()) break;
                    System.out.println("Invalid: name cannot be empty.");// --- If the user input is empty or only whitespace, print an error message and prompt again
                }
                int score;
                while (true) {
                    System.out.print("Enter score for student " + i + " (0-100): ");// --- Prompt the user to enter the score of the student
                    if (input.hasNextInt()) {
                        score = input.nextInt();
                        input.nextLine();
                        if (score >= 0 && score <= 100) break;
                        System.out.println("Invalid: must be 0-100.");// --- If the user input is not a valid integer, print an error message and prompt again
                    } else {
                        System.out.println("Invalid: must be a whole number.");// --- If the user input is not a valid integer, print an error message and prompt again
                        input.nextLine();
                    }
                }
                pw.println(name + "," + score);
            }
            pw.close();
            System.out.println("Saved to results.txt");// --- Print a message to the console indicating that the data has been saved to the file
        } catch (Exception e) {
            System.out.println("Could not write to results.txt: " + e.getMessage());// --- If there is an error writing to the file, print an error message to the console
        }

        input.close();
    }
}