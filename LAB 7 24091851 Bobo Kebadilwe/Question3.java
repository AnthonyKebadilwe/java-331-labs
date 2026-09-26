import java.io.*;
import java.util.*;

//Question 3 - Handling a Missing File

public class Question3 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new FileReader("missing.txt")); // this file should not exist, so this line should fail

            while (file.hasNextLine()) { // this loop never actually runs since the file open fails first
                System.out.println(file.nextLine());
            }
            file.close();
        } catch (Exception e) {
            // FileReader throws an exception when the file can't be found - we catch it here
            // instead of letting the program crash, and print a friendly message instead
            System.out.println("Sorry, missing.txt could not be found.");
        }
    }
}