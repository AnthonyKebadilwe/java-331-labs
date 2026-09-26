//Question 8 - Comparing Objects

public class Question8 {
    public static void main(String[] args) {
        Book book1 = new Book("ALL Tommorows", "C. M. Kösemenn", 120.50);
        Book book2 = new Book("I Have No Mouth, and I Must Scream", "Harlan Ellison", 95.00);

        Book cheaper = cheaperBook(book1, book2);
        System.out.println("Cheaper book is " + cheaper.getSummary());
    }

    public static Book cheaperBook(Book a, Book b) { // returns whichever book has the lower price
        if (a.getPrice() <= b.getPrice()) return a;
        return b;
    }
}