
import java.util.*;   //--- Import the Scanner and PrintWriter classes from the java.util and java.io packages

 // Question 4 - Decimal to Binary

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        while (true) { // keep asking until a whole number is entered
            System.out.print("Enter a whole number: ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                break;
            }
            System.out.println("Invalid: must be a whole number.");
            input.next();
        }

        int n = Math.abs(number); // work with the positive value, remember the sign separately
        String binary = "";

        if (n == 0) {
            binary = "0";
        } else {
            while (n > 0) {
                int remainder = n % 2;       // remainder is always 0 or 1 - the next binary digit
                binary = remainder + binary; // add the new digit to the front of the string
                n = n / 2;                   // move on to the next digit
            }
        }

        if (number < 0) binary = "-" + binary; // put the negative sign back on if needed

        System.out.println("Binary: " + binary);
        input.close();
    }
}




























