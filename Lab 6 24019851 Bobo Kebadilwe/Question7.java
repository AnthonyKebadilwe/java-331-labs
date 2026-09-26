public class Question7 {
//doubles the local copy of number, but does not affect the original variable in main().
    static void tryToDouble(int number) {
        number = number * 2;
    }

    public static void main(String[] args) {
        int value = 10;
        tryToDouble(value);
        System.out.println(value); //---still 10, Java passes primitives by value
    }
}