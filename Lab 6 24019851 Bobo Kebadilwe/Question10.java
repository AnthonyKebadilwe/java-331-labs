import java.util.Scanner;

public class Question10 {

    static class Rectangle {
        // Returns length * width
        static double area(double length, double width) {
            return length * width;
        }

        // Returns 2 * (length + width)
        static double perimeter(double length, double width) {
            return 2 * (length + width);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // reads input from the keyboard

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.println("Area: " + Rectangle.area(length, width));
        System.out.println("Perimeter: " + Rectangle.perimeter(length, width));

        sc.close(); // good practice: closes the input stream when done
    }
}