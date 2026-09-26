import java.io.PrintWriter;//--- Import the Scanner class for user input

//Question 2 - Writing an Array to a File

public class Question2 {
    public static void main(String[] args) {
        double[] numbers = {12.5, 8.3, 45.0, 3.75, 19.9}; // array of doubles to write out

        try {
            PrintWriter pw = new PrintWriter("doubles.txt");

            for (int i = 0; i < numbers.length; i++) { // loop through every value in the array
                pw.println(numbers[i]); // write one value per line
            }

            pw.close();
            System.out.println("Saved to doubles.txt");
        } catch (Exception e) {
            System.out.println("Error!!!! " + e.getMessage());
        }
    }
}
    
