public class Question1 {
//---returns true if the given integer n is even, false otherwise.
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isEven(7));
        System.out.println(isEven(0));
        System.out.println(isEven(-3));
    }
}
