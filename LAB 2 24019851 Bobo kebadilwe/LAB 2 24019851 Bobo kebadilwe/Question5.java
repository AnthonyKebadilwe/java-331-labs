import java.io.*;
import java.util.*;   //--- Import the Scanner and PrintWriter classes from the java.util and java.io packages

public class Question5 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new FileReader("students.txt"));
            PrintWriter pw = new PrintWriter("grades.txt");
//--- Create a Scanner object to read from the file "students.txt" and a PrintWriter object to write to the file "grades.txt"
            while (file.hasNextLine()) {
                String[] parts = file.nextLine().split(",");
                String name = parts[0];
                int score = Integer.parseInt(parts[1].trim());

                String grade;
                if (score >= 80) grade = "A";else if (score >= 70) grade = "B";else if (score >= 60) grade = "C";else if (score >= 50) grade = "D";else grade = "F";// --- Determine the letter grade based on the score

                pw.println(name + "," + score + "," + grade);// --- Write the student's name, score, and letter grade to the output file
            }
            file.close();// --- Close the input file bebuse we are done reading from it
            pw.close();// --- Close the output file becuase we are done writing to it
            System.out.println("Saved to grades.txt");// --- Print a message to the console indicating that the data has been saved to the file
        } catch (Exception e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }
}