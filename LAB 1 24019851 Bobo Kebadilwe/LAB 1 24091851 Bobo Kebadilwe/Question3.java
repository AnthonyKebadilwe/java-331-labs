//.....Table of contants
//A1... java Scanner import statement
//A2... Read the name first and then the age
//A3... Combine both values into one friendly, slightly time-travelling sentence
//....................................................................

//A1 java Scanner import statement
//labrary for the java scanner used to recognise user input
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
    //A2 Read the name first and then the age   
        Scanner sc = new Scanner(System.in);
  
    System.out.print("Enter your name: ");
     String name = sc.nextLine();

     System.out.print("Enter your age: ");
     int age = sc.nextInt();

    //A3Combine both values and prints the greeting message
    System.out.println("Nice to meet you, " + name + "! You are " + age + " years old today.");
        sc.close();
    }
}