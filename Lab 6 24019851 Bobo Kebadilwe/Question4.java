public class Question4 {
//overloaded methods that combine two values of different types (int, String, double) and return the result.
    static int combine(int a, int b) {
        return a + b;
    }

    static String combine(String a, String b) {
        return a + b;
    }

    static double combine(double a, double b) {
        return a + b;
    }
//picks the correct combine method based on the argument types and returns the combined result.
    public static void main(String[] args) {
        System.out.println(combine(3, 4));
        System.out.println(combine("Hello, ", "World!"));
        System.out.println(combine(2.5, 1.5));
    }
}