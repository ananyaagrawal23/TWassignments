package Main.Test;

import Main.Author;
import Main.BookAdvanced;

public class TestBookAdvanced {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Declare and allocate a Book instance
        BookAdvanced javaDummy = new BookAdvanced("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);

        // Test Getters and Setters
        javaDummy.setPrice(29.95);
        javaDummy.setQty(28);
        System.out.println("name is: " + javaDummy.getName());
        System.out.println("price is: " + javaDummy.getPrice());
        System.out.println("qty is: " + javaDummy.getQty());
        System.out.println("Authors are: " + javaDummy.getAuthorNames());

        // Print details of each author
        for (Author author : javaDummy.getAuthors()) {
            System.out.println("Author's name is: " + author.getName());
            System.out.println("Author's email is: " + author.getEmail());
            System.out.println("Author's gender is: " + author.getGender());
        }

        // Use an anonymous array of Authors to construct a Book instance
        BookAdvanced anotherBook = new BookAdvanced("More Java",
                new Author[] {
                        new Author("Peter Lee", "peter@somewhere.com", 'm'),
                        new Author("Jane Doe", "jane@nowhere.com", 'f')
                },
                29.95);
        System.out.println(anotherBook);  // Test toString()
    }
}
