import java.util.*;


//Question 9 - A Class That Uses Another Class

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>(); // holds every book added to the library

    public void addBook(Book b) { books.add(b); } // add one more book to the list

    public void printAllBooks() { // print every book currently stored
        for (int i = 0; i < books.size(); i++) System.out.println(books.get(i).getSummary());
    }
}