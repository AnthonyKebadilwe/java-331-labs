
//Question 4 - Adding a Method (getSummary)

public class Question4 {
    public static void main(String[] args) {
        Book book = new Book("ALL Tommorows", "C. M. Kösemenn", 120.50);// create a new Book object which calls the constructor in Book.java
        System.out.println(book.getSummary()); // getSummary() itself lives in Book.java
    }
}