import java.io.*;  // Imports ArrayList, HashMap, Scanner, etc.
import java.util.*;


//Question 1 - Reading Words into an Array

public class Question1 {
    public static void main(String[] args) {
        String[] names = new String[20]; // array with a fixed capacity of 20
        int count = 0; // how many names we have actually read so far

        try {
            Scanner file = new Scanner(new FileReader("names.txt"));

            while (file.hasNext() && count < 20) { // stop once the array is full or the file ends
                names[count] = file.next(); // next() reads one word at a time
                count++;
            }
            file.close();

            for (int i = 0; i < count; i++) { // print only the slots we actually filled
                System.out.println(names[i]);
            }
        } catch (Exception e) {
            System.out.println("Could not read names.txt" + e.getMessage());
        }
    }
}







