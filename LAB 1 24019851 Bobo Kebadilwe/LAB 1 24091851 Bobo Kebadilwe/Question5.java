
// java scanner import statement
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //A1---Read as double so the quotient keeps its decimal places
        System.out.print("Enter the first number here: ");
        double first = sc.nextDouble();


        System.out.print("Enter the second number here: ");
        double second = sc.nextDouble();

        //A2---Simple arithmetic operations
        double sum = first + second;          //Addition
        double difference = first - second;  //subtraction
        double product = first * second;     //multiplication
        double quotient = first / second;    //division (up to 2 decimal places)
        double remainder = first % second;   //modulus (remainder of the division)


        //A3---The five basic arithmetic operators, laid out one per line
        System.out.println("Sum is equal to " + sum);
        System.out.println("Difference is equal to " + difference);
        System.out.println("Product is equal to " + product);
        System.out.println("Quotient is equal to " + quotient);
        System.out.println("Remainder is equal to " + remainder);


        sc.close();
         }
    }
