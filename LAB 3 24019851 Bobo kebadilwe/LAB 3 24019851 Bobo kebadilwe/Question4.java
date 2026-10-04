import java.util.*;

 //Question 4  Repeating Menu 

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0; //---starting value just needs to not equal 2, so the loop runs at least once

        do {
            System.out.println("1. Continue");//---display continue option
            System.out.println("2. Exit");//---display exit option
            System.out.print("Enter your choice here ");//---prompt for input

            if (!input.hasNextInt()) { System.out.println("Invalid: enter 1 or 2."); input.next(); continue; }

            choice = input.nextInt();
        } while (choice != 2); //---keep looping until the user enters 2

        System.out.println("Goodbye!");
        input.close();
    }
}