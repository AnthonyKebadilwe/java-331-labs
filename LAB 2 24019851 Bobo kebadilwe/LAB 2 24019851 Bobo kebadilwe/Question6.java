import java.util.*; // Imports ArrayList, HashMap, Scanner, etc.

public class Question6 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in); //--- Create a Scanner object to read user input (which are numbers that represent days of the week)
        int day;

        while (true) {
            System.out.print("Enter a day number (1-7)=(Mon-Sun) "); // ---Prompt the user to enter a number that represents a day of the week (1 for Monday, 2 for Tuesday, etc.)
            if (input.hasNextInt()) {
                day = input.nextInt();
                break;
            }
            System.out.println("must be a whole number dude!.");   // ---If the user input is not a valid integer, print an error message and prompt again
            input.next();
        }
        switch (day) { //--- Use a switch statement to determine which day of the week corresponds to the input number
            case 1: System.out.println("Monday"); break;case 2: System.out.println("Tuesday"); break;case 3: System.out.println("Wednesday"); break;case 4: System.out.println("Thursday"); break;case 5: System.out.println("Friday"); break;case 6: System.out.println("Saturday"); break;case 7: System.out.println("Sunday"); break;
            default: System.out.println("we only have 7 days in a week dude!"); break;// --- If the input number is not between 1 and 7, print an error message
        }

        input.close();
    }
}