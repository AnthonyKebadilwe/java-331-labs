
public class Book {
    private String title;  // private - can only be reached through the methods below
    private String author;
    private double price;

    public Book(String title, String author, double price) { // sets all 3 fields when a Book is created
        this.title = title;   // "this" means the field; the plain name means the parameter
        this.author = author;
        this.price = price;
    }

    // getters - read a private field
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    // setters - change a private field
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPrice(double price) { this.price = price; }

    public String getSummary() { // combines all 3 fields into one readable String
        return title + " by " + author + " - P" + price;
    }
}