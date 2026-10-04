import java.util.*; 

//Question 5 Validating Input 

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0; //---starting value just needs to be outside 1-10
 
        do {
            System.out.print("Enter a number between 1 and 10 here ");//---prompt for input
            if (!input.hasNextInt()) { System.out.println("Invalid: enter an integer."); input.next(); continue; }
            number = input.nextInt();
        } while (number < 1 || number > 10); //---keep looping until the number is in range
 
        System.out.println("You entered " + number);//---display the number entered
        input.close();
    }
}
 
