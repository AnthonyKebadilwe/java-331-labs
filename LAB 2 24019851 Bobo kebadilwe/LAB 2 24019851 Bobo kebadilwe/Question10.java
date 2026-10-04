import java.io.*;
import java.util.*;   

public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//--- Create a Scanner object to read user input from the console
        int target;
//--- Prompt the user to enter a whole number to search for in the file "numbers.txt"
        while (true) {
            System.out.print("Enter a Whole number to search for here ");
            if (input.hasNextInt()) {
                target = input.nextInt();
                break;
            }
            System.out.println(" whole number Dude?.");
            input.next();
        }
//--- Initialize a boolean variable to keep track of whether the target number is found in the file
        boolean found = false;
        try {
            Scanner file = new Scanner(new FileReader("numbers.txt"));
            while (file.hasNextInt()) {
                int num = file.nextInt();
                if (num == target) {
                    found = true;
                    break;
                }
            }
            file.close();
        } catch (Exception e) {//--- Catch any exceptions that occur during file reading
            System.out.println("Error reading the file numbers.txt " + e.getMessage());
        }
        System.out.println(found);
        input.close();
    }
}