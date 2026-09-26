import java.io.*;
import java.util.*;

//Question 4 - Counting Lines

public class Question4 {
    public static void main(String[] args) {
        int lineCount = 0; // running total of how many lines we've seen

        try {
            Scanner file = new Scanner(new FileReader("story.txt"));

            while (file.hasNextLine()) { // hasNextLine() checks if there's another line to read
                file.nextLine();  // we don't need the text itself, just moving past the line
                lineCount++;      // add one for every line consumed
            }
            file.close();

            System.out.println("Number of lines: " + lineCount);
        } catch (Exception e) {
            System.out.println("Could not read story.txt" + e.getMessage());
        }
    }
}