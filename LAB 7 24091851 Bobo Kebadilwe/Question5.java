import java.io.*;
import java.util.*;

//Question 5 - Counting Words

public class Question5 {
    public static void main(String[] args) {
        int wordCount = 0; // running total of every word across all lines

        try {
            Scanner file = new Scanner(new FileReader("story.txt"));

            while (file.hasNextLine()) {
                String line = file.nextLine(); // read one full line
                StringTokenizer st = new StringTokenizer(line); // splits that line into words, default delimiter is whitespace
                wordCount += st.countTokens(); // countTokens() = how many words were in this line
            }
            file.close();

            System.out.println("Total word count: " + wordCount);
        } catch (Exception e) {
            System.out.println("Could not read story.txt" + e.getMessage());
        }
    }
}