import java.util.*;

// Question 7 Multiplication Table 

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a number here ");//---prompt user for input
            if (input.hasNextInt()) { number = input.nextInt(); break; }//
            System.out.println("Invalid: must be an integer.");//---invalid: must be an integer
            input.next();
        }

        for (int i = 1; i <= 12; i++) // print the table from x1 to x12
            System.out.println(number + " x " + i + " = " + (number * i));

        input.close();
    }
}