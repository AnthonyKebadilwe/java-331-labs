import java.io.*;
import java.util.*;

//Question 10 - Putting It Together

public class Question10 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new FileReader("results.txt")); // the file written by Question 9
            PrintWriter pw = new PrintWriter("passed.txt");            // only the passing students go here

            while (file.hasNextLine()) {
                String line = file.nextLine(); // one "Name,Score" line at a time
                StringTokenizer st = new StringTokenizer(line, ","); // splits on the comma this time, not whitespace
                String name = st.nextToken();                 // first token is the name
                int score = Integer.parseInt(st.nextToken()); // second token is the score, as text - convert it to int

                if (score >= 50) { // only keep the students who passed
                    pw.println(name + "," + score);
                }
            }

            file.close();
            pw.close();
            System.out.println("Saved to passed.txt");
        } catch (Exception e) {
            System.out.println("Error!!!! " + e.getMessage());
        }
    }
}