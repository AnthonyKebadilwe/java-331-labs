import java.io.*;
import java.util.*;

//Question 8 - Summing Numbers from a File

public class Question8 {
    public static void main(String[] args) {
        int total = 0; // running total of the numbers read so far

        try {
            Scanner file = new Scanner(new FileReader("numbers.txt"));

            while (file.hasNextInt()) { // hasNextInt() checks the next token is a whole number
                total += file.nextInt(); // nextInt() reads it and moves the scanner forward
            }
            file.close();

            System.out.println("Total of all numbers: " + total);
        } catch (Exception e) {
            System.out.println("Could not read numbers.txt" + e.getMessage());
        }
    }
}