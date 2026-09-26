import java.io.*;//--- Import PrintWriter for writing to files

//Question 2 - Writing to a File

public class Question2 {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("output.txt"); // creates (or overwrites) output.txt

            pw.println("First line of output.");  // println() writes the line plus a newline
            pw.println("Second line of output.");
            pw.println("Third line of output.");
            pw.println("Fourth line of output.");
            pw.println("Fifth line of output.");

            pw.close(); // closing the writer flushes everything to disk
            System.out.println("Saved to output.txt");
        } catch (Exception e) {
            // catches any problem creating or writing the file
            System.out.println("Error!!!! " + e.getMessage());
        }
    }
}