
//Question 3 - Creating Objects

public class Question3 {
    public static void main(String[] args) {
        Book book1 = new Book("ALL Tommorows", "C. M. Kösemenn", 120.50);// create a new Book object which calls the constructor in Book.java
        Book book2 = new Book("I Have No Mouth, and I Must Scream", "Harlan Ellison", 95.00);

        System.out.println("Title... " + book1.getTitle() + ", Author... " + book1.getAuthor() + ", Price P " + book1.getPrice());//prints the title, author and price of book1 using the getter methods in Book.java
        System.out.println("Title... " + book2.getTitle() + ", Author... " + book2.getAuthor() + ", Price P " + book2.getPrice());
    }
}