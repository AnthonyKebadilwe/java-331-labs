//Table of contents
//A1---Find the space that separates first name from surname
//A2---Extract initials
//A3---Print the result
//.............................................................................

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name here---> ");
        String fullName = sc.nextLine();// reads the entire line including spaces, so it can capture both first name and surname

        //A1---Find the space that separates first name from surname
        int spaceIndex = fullName.indexOf(' '); //extracts characters from position 0

        String firstName = fullName.substring(0, spaceIndex); //extracts characters from position 0 not including the space index
        String surname = fullName.substring(spaceIndex + 1); //extracts characters after the space +1 will skip over the space itself

        //A2---Extract initials
        //charAt(0) grabs the first letter of each part; toUpperCase() makes the initial proper
        //character.toUpperCase() converts the character to uppercase
        char firstInitial = Character.toUpperCase(firstName.charAt(0));
        char lastInitial = Character.toUpperCase(surname.charAt(0));

        //A3---Print the result
        System.out.println("First name is " + firstName);
        System.out.println("Surname is " + surname);
        System.out.println("Initials are " + firstInitial + "." + lastInitial + ".");

        sc.close();
    }
}
