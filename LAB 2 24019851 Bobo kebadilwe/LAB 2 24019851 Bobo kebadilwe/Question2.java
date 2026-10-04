import java.util.*;//--- Import the Scanner class for user input

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String letter;
//--- Prompt the user to enter their full name and a single letter, validating the input to ensure that the name is not empty and the letter is a single character
        while (true) {
            System.out.print("Enter your full name here: ");
            name = input.nextLine();//--- Prompt the user to enter their full name, validating the input to ensure that the name is not empty
            if (!name.trim().isEmpty()) break;//--- If the user input is empty or only whitespace, print an error message and prompt again
            System.out.println("Invalid: name cannot be empty.");
        }
//--- Prompt the user to enter a single letter, validating the input to ensure that it is exactly one character long and is a letter
        while (true) {
            System.out.print("Enter a single letter to check the name against: ");
            letter = input.next();
            if (letter.length() == 1 && Character.isLetter(letter.charAt(0))) break;//--- If the user input is not exactly one character long or is not a letter, print an error message and prompt again
            System.out.println("Invalid: enter exactly one letter.");
        }
//--- Print the number of characters in the name, the name in uppercase and lowercase, and whether the name starts with the specified letter (case-insensitive)
        System.out.println("Number of characters: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Starts with '" + letter + "': " + name.toLowerCase().startsWith(letter.toLowerCase()));

        input.close();
    }
}