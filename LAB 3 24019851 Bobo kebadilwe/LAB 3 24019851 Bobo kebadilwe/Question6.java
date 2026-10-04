import java.util.*;

// Question 6 Running Total 
 
public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = -1, total = 0; //---number just needs to start as anything other than 0

        do {
            System.out.print("Enter a number here ");//---prompt for input
            if (!input.hasNextInt()) { System.out.println("Invalid: enter an integer."); input.next(); continue; }
            number = input.nextInt();
            total += number; //---adding 0 at the end doesn't change the total, so this is safe
        } while (number != 0); //---keep looping until the user enters 0

        System.out.println("Total: " + total);//---display the total
        input.close();
    }
}