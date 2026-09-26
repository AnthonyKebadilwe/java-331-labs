import java.io.*;
import java.util.*;

//Question 6 - Copying a File

public class Question6 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new FileReader("story.txt")); // source file, for reading
            PrintWriter pw = new PrintWriter("story_copy.txt");      // destination file, for writing

            while (file.hasNextLine()) { // copy every line straight across, one at a time
                pw.println(file.nextLine()); // read a line, then immediately write it out
            }

            file.close(); // close the file we read from
            pw.close();   // close the file we wrote to, so it actually saves
            System.out.println("Saved to story_copy.txt");
        } catch (Exception e) {
            System.out.println("Error!!!! " + e.getMessage());
        }
    }
}