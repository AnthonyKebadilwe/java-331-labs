import java.util.*;

// Question 8 Counting Vowels 

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String text = input.nextLine().toLowerCase(); //---lowercase so we only need to check 5 letters

        int vowelCount = 0;
        for (int i = 0; i < text.length(); i++) { 
            char c = text.charAt(i); //---get the character at the current index
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowelCount++; //--increment the count if we find a vowel
        }

        System.out.println("Number of vowels is " + vowelCount);
        input.close();
    }
}