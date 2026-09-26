import java.io.*;
import java.util.*;

//Question 9 - Writing Name-Score Pairs

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // reads what the user types

        try {
            PrintWriter pw = new PrintWriter("results.txt"); // file we're writing the pairs to

            for (int i = 1; i <= 3; i++) { // loop three times, once per student
                System.out.print("Enter student " + i + " name: ");
                String name = input.nextLine(); // nextLine() reads the whole name, spaces included

                System.out.print("Enter student " + i + " score: ");
                int score = input.nextInt();   // nextInt() only reads the number
                input.nextLine();              // clears the leftover newline left behind by nextInt()

                pw.println(name + "," + score); // write it out as a "Name,Score" line, comma-separated
            }

            pw.close();
            System.out.println("Saved to results.txt");
        } catch (Exception e) {
            System.out.println("Error!!!! " + e.getMessage());
        }

        input.close(); // close the keyboard scanner too, once we're done with it
    }
}