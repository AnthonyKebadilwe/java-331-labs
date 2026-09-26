public class Question6 {
//--- intiance field belongs to the class and is shared among all instances of the class.
    static class Calculator {
        private int callCount = 0;

        static int add(int a, int b) {
            return a + b;
        }

        int multiply(int a, int b) {
            callCount++;
            return a * b;
        }
    }
// ---calculator class with static add method and instance multiply method, along with a callCount variable to track the number of times multiply is called.
    public static void main(String[] args) {
        System.out.println(Calculator.add(3, 5));

        Calculator calc = new Calculator();//---create an instance of the Calculator class
        System.out.println(calc.multiply(2, 3));
        System.out.println(calc.multiply(4, 4));
        System.out.println("Times multiply() was called: " + calc.callCount);
    }
}