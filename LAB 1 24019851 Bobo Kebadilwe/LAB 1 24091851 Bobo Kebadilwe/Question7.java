//Table of contents       
//A1---Read the temperature in Celsius as a double
//A2---Convert to Fahrenheit
//A3---Print the result
//.............................................................................

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //A1---Read the temperature in Celsius as a double
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();    //read the temperature in Celsius as a double                    

        //A2---Convert to Fahrenheit
        // converts the tempreture to Fahrenheit using the formula: F = C * 9/5 + 32
        double fahrenheit = celsius * 9.0 / 5 + 32; 
        //A3---Print the result
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");

        sc.close();
    }
}