public class Question2 {
//---returns the area of a circle given its radius.
    static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
//---area of a circle given its radius.
    public static void main(String[] args) {
        System.out.println(circleArea(2.0));
        System.out.println(circleArea(5.5));
    }
}