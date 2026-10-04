import java.io.*;
import java.util.*; //--- Import the Scanner and PrintWriter classes from the java.util and java.io packages  

public class Question8 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new FileReader("numbers.txt"));//--- Create a Scanner object to read from the file "numbers.txt"
            int evenCount = 0, oddCount = 0;//--- Initialize variables to keep track of the count of even and odd numbers

            while (file.hasNextInt()) {
                int num = file.nextInt();
                if (num % 2 == 0) evenCount++; else oddCount++;//--- Count the number of even and odd numbers in the file "numbers.txt"
            }
            file.close();

            PrintWriter pw = new PrintWriter("evenodd.txt");
            pw.println("Even count: " + evenCount);pw.println("Odd count: " + oddCount);//--- Write the counts of even and odd numbers to the file "evenodd.txt"
            pw.close();

            System.out.println("Saved to evenodd.txt");//--- Print a message to the console indicating that the data has been saved to the file
        } catch (Exception e) {//--- Catch any exceptions that occur during file reading or writing
            System.out.println("!!!Error!!! " + e.getMessage());
        }
    }
}