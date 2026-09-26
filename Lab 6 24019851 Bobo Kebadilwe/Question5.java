public class Question5 {
//---overload 1:just a name
    static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        displayInfo("Thabo");
        displayInfo("Lorato", 21);
    }
}
