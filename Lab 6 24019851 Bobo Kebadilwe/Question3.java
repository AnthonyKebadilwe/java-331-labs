public class Question3 {
//---void method that prints a banner message to the console.
    static void printBanner() {
        System.out.println("$$$ Welcome to COMP311 Ya ONTY $$$");
    }
//---returns the banner message as a string.
    static String getBanner() {
        return "$$$ Welcome to COMP311 Ya ONTY $$$";
    }

    public static void main(String[] args) {
        printBanner();//---prints stright to the console
        String banner = getBanner();//---returns the banner message as a string.
        System.out.println(banner);//---prints the banner message to the console.   
    }
}