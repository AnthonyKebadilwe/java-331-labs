
//Question 6 - An Array of Objects
 
public class Question6 {
    public static void main(String[] args) {
        Book[] books = new Book[3]; // array to hold 3 Book objects
        books[0] = new Book("ALL Tommorows", "C. M. Kösemenn", 120.50);
        books[1] = new Book("I Have No Mouth, and I Must Scream", "Harlan Ellison", 95.00);
        books[2] = new Book("The Shining", "Stephen King", 150.75);

        for (int i = 0; i < books.length; i++) System.out.println(books[i].getSummary());
    }
}