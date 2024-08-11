package Main;

public class BookAdvanced {
    private final String name;
    private final Author[] authors;  // Composition: Book HAS-A array of Authors
    private double price;
    private int qty = 0;

    // Constructors
    public BookAdvanced(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public BookAdvanced(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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
    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            if (i > 0) {
                authorNames.append(", ");
            }
            authorNames.append(authors[i].getName());
        }
        return authorNames.toString();
    }

    // toString() method
    @Override
    public String toString() {
        StringBuilder authorDetails = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            if (i > 0) {
                authorDetails.append(",");
            }
            authorDetails.append(authors[i].toString());
        }
        return "Book[name=" + name + ",authors={" + authorDetails + "},price=" + price + ",qty=" + qty + "]";
    }
}
