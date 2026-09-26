import java.io.*;

//Question 7 - Appending to a File

public class Question7 {
    public static void main(String[] args) {
        try {
            // FileWriter's second argument, true, means "append" instead of "overwrite"
            // so the existing lines in output.txt from Question 2 stay untouched
            PrintWriter pw = new PrintWriter(new FileWriter("output.txt", true));

            pw.println("Sixth line, added later.");   // gets added after the existing 5 lines
            pw.println("Seventh line, added later.");

            pw.close();
            System.out.println("Appended to output.txt");
        } catch (Exception e) {
            System.out.println("Error!!!! " + e.getMessage());
        }
    }
}