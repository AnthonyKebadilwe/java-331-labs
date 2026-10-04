import java.util.*;

//Question 2 - Sum of Numbers 

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        while (true) { //---keep asking until we get a positive whole number
            System.out.print("Enter a positive whole number here ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number > 0) break;
                System.out.println("Invalid: must be greater than 0.");//---invalid: must be greater than 0
            } else {
                System.out.println("Invalid: must be a whole number.");//---invalid: must be a whole number
                input.next();
            }
        }

        int sum = 0, i = 1; //---declared together since they're used together
        while (i <= number) { sum += i; i++; } //---add 1, 2, 3... up to number, all in one loop body

        System.out.println("Sum: " + sum);
        input.close();
    }
}