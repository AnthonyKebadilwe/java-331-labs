//Table of contents
//A1---Scanner can pull several space-separated values from a single line of input
//A2---Using doubles throughout avoids truncated (integer) division
//A3---Print the results
//.............................................................................

// java scanner import statement
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //A1---Scanner can pull several space-separated values from a single line of input
        //reads three numbers off one line, separated by spaces with out the need to press enter 3 times
        System.out.print("Enter three scores: ");
        double score1 = sc.nextDouble();
        double score2 = sc.nextDouble();
        double score3 = sc.nextDouble();

        //A2---Using doubles throughout avoids truncated (integer) division
        // Calculate the average of the three scores
        double average = (score1 + score2 + score3) / 3;

        //A3---Print the results
        System.out.println("Average: " + average);

        sc.close();
    }
}
