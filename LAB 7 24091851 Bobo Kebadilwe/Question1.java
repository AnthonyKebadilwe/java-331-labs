import java.io.*;   // Imports FileReader, PrintWriter, etc.
import java.util.*; // Imports Scanner, StringTokenizer, ArrayList, etc.

//Question 1 - Reading a File

public class Question1 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new FileReader("story.txt")); // FileReader opens the file, Scanner reads it

            while (file.hasNextLine()) { // keep going until there are no lines left
                String line = file.nextLine(); // grabs one whole line of text
                System.out.println(line); // prints that line to the console
            }

            file.close(); // always close the file when done reading
        } catch (Exception e) {
            // this runs if story.txt doesn't exist or can't be opened
            System.out.println("Could not read story.txt" + e.getMessage());
        }
    }
}