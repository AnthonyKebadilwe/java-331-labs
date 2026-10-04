import java.io.*;
import java.util.*;   

public class Question3 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new FileReader("students.txt"));//--- Open the file students.txt for reading
            while (file.hasNextLine()) {
                String[] parts = file.nextLine().split(",");//--- Split the line into parts using a comma as the delimiter
                System.out.println("the students name is " + parts[0] + " and the Score is " + parts[1]);//--- Print the student's name and score to the console
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Could not read the file students.txt: " + e.getMessage());//--- If there is an error reading the file, print an error message to the console
        }
    }
}