import java.io.*;
import java.util.*;  

public class Question9 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new FileReader("numbers.txt"));
            long positiveTotal = 0, negativeTotal = 0;
            int positiveCount = 0, negativeCount = 0;
//--- Initialize variables to keep track of the totals and counts of positive and negative numbers
            while (file.hasNextInt()) {
                int num = file.nextInt();
                if (num > 0) { positiveTotal += num; positiveCount++; } else if (num < 0) { negativeTotal += num; negativeCount++; }//--- Update the totals and counts of positive and negative numbers accordingly
            }
            file.close();
//--- Create a PrintWriter object to write to the file "signs.txt"
            PrintWriter pw = new PrintWriter("signs.txt");
            pw.println("Positive totalis " + positiveTotal + " (" + positiveCount + " numbers)");pw.println("Negative total is " + negativeTotal + " (" + negativeCount + " numbers)");//--- Write the totals and counts of positive and negative numbers to the file "signs.txt"
            pw.close();
//--- Print a message to the console indicating that the data has been saved to the file
            System.out.println("Saved to signs.txt");//--- Print a message to the console indicating that the data has been saved to the file
        } catch (Exception e) {//--- Catch any exceptions that occur during file reading or writing
            System.out.println("!!!Error!!! " + e.getMessage());
        }
    }
}