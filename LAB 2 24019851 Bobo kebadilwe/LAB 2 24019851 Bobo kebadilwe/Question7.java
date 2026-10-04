import java.io.*;
import java.util.*;  //--- Import the Scanner and PrintWriter classes from the java.util and java.io packages

public class Question7 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new FileReader("numbers.txt"));//--- Create a Scanner object to read from the file "numbers.txt"
            int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE, count = 0;//--- Initialize variables to keep track of the smallest and largest numbers, as well as the count of numbers read
            long sum = 0;

            while (file.hasNextInt()) {    //--- While there are more integers to read from the file, read the next integer and update the smallest, largest, sum, and count variables accordingly
                int num = file.nextInt();
                if (num < smallest) smallest = num;if (num > largest) largest = num;sum += num;count++;//--- Update the smallest, largest, sum, and count variables accordingly
            }
            file.close();

            double average = (double) sum / count;//--- Calculate the average of the numbers read from the file

            PrintWriter pw = new PrintWriter("stats.txt");
            pw.println("Smallest is " + smallest);pw.println("Largest is " + largest);pw.println("Average is " + average);pw.close();//--- Write the smallest, largest, and average values to the file "stats.txt"

            System.out.println("Saved to stats.txt");
        } catch (Exception e) {  //--- If there is an error reading from the file or writing to the output file, print an error message
            System.out.println("!!!Error!!! " + e.getMessage());
        }
    }
}