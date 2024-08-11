package Main;

public class Book {
    private final String name;
    private final Author author;  // Composition: Book HAS-A Author
    private double price;
    private int qty = 0;

    // Constructors
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Additional methods
    public String getAuthorName() {
        return author.getName();
    }

    public String getAuthorEmail() {
        return author.getEmail();
    }

    public char getAuthorGender() {
        return author.getGender();
    }

    // toString() method
    @Override
    public String toString() {
        return "Book[name=" + name + ",Author[" + author.toString() + "],price=" + price + ",qty=" + qty + "]";
    }
}
