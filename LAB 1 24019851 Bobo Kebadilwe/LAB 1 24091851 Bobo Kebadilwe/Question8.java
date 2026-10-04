//Table of Contents
//A1---Read the length and width of a rectangle as doubles
//A2---Calculate the area and perimeter of the rectangle
//A3---Print the results

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //A1---Read the length and width of a rectangle as doubles
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width: ");
        double width = sc.nextDouble();
        //A2---Calculate the area and perimeter of the rectangle
        double area = length * width; //Multiplication(area)
        double perimeter = 2 * (length + width); //parentheses will double length and width and then add them together, then multiply by 2 to get the perimeter

        //A3---Print the results
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        sc.close();
    }
}
