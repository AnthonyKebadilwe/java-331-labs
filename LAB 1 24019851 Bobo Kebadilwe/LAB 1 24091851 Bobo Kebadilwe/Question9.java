//...Table of contents
//A1---Read a sentence from the user
//A2---A quick String method tour: length, case conversion, and a keyword search
//A3---Print the results
//.............................................................................

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //A1---Read a sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine(); //reads the entire line including

        //A2---A quick String method tour: length, case conversion, and a keyword search
        int length = sentence.length();
        String upper = sentence.toUpperCase(); // returns a new string with every letter converted to uppercase
        String lower = sentence.toLowerCase();// returns a new string with every letter converted to lowercase
        boolean containsJava = sentence.contains("Java"); // if true, the sentence contains the word "Java"; if false, it does not
        
       //A3---Print the results
        System.out.println("Length: " + length);
        System.out.println("Upper case: " + upper);
        System.out.println("Lower case: " + lower);
        System.out.println("Contains \"Java\": " + containsJava);

        sc.close();
    }
}
