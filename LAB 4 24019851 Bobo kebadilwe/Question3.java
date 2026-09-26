import java.io.*;

public class Question3 {
    public static void main(String[] args) {
        int[] numbers = {23, -5, 67, 12, 89, -34, 45}; // array of integers to process

        int sum = 0;
        int smallest = numbers[0]; // start both from the first value in the array
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // keep a running total
            if (numbers[i] < smallest) smallest = numbers[i]; // update smallest if this one is lower
            if (numbers[i] > largest) largest = numbers[i];   // update largest if this one is higher
        }

        try {
            PrintWriter pw = new PrintWriter("arraystats.txt");
            pw.println("Sum: " + sum);
            pw.println("Smallest is " + smallest);
            pw.println("Largest is " + largest);
            pw.close();

            System.out.println("Saved to arraystats.txt");
        } catch (Exception e) {
            System.out.println("Error!!! " + e.getMessage());
        }
    }
}












