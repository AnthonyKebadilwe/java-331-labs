//Question 10 - Putting It Together

public class Question10 {
    public static void main(String[] args) {
        Library library = new Library();//--- create a new Library object

        library.addBook(new Book("ALL Tommorows", "C. M. Kösemenn", 120.50));// ---add a Book object to the library
        library.addBook(new Book("I Have No Mouth, and I Must Scream", "Harlan Ellison", 95.00));
        library.addBook(new Book("The Shining", "Stephen King", 150.75));
        library.addBook(new Book("The Shadow Out of Time", " H.P. Lovecraft", 110.00));
        library.printAllBooks();// ----- print all books in the library
    }
}