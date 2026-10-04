import java.util.*;

//Question 9  Factorial 

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a whole number here ");//---prompt user for input
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number >= 0) break; //---factorial isn't defined for negative numbers
                System.out.println("Invalid: must be 0 or greater.");//---invalid: must be 0 or greater. Factorial isn't defined for negative numbers
            } else {
                System.out.println("Invalid: must be a whole number.");//---invalid: must be a whole number. Factorial isn't defined for negative numbers
                input.next();
            }
        }

        long factorial = 1; //---long instead of int, since factorials grow very large very fast
        for (int i = 1; i <= number; i++) factorial *= i;

        System.out.println(number + "! = " + factorial);//---factorial isn't defined for negative numbers
        input.close();
    }
}