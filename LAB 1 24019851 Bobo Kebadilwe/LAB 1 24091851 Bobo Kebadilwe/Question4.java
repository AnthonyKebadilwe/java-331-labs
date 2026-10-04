//....Table of contants
//A1... java Scanner import statement
//A2...  Reads non-negative integer, decimal number and a single word from the user
//A3...a single word  is selected with Next() tool
//A4... Combine both values  you had entered and a single word into one sentence.
//.............................................................................

//A1 java Scanner import statement
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //A2 Reads non-negative integer, decimal number and a single word from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a a Non-negative integer here: ");
        int wholeNumber = sc.nextInt();     

        System.out.print("Enter a decimal number here: ");
        double decimalNumber = sc.nextDouble();

        //A3 a single word  is selected with Next() tool
        System.out.print("Enter a single word here: ");
        String word = sc.next();
        //A4 Combine both values  you had entered and a single word into one sentence.
        System.out.println("You entered " + wholeNumber + ", " + decimalNumber + ", and the word \"" + word + "\".");   

        sc.close();
    }
}