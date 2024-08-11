package Main.Test;

import Main.Author;

public class TestAuthor {
    public static void main(String[] args) {
        // Test the constructor
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // Test toString()

        // Test setter
        ahTeck.setEmail("paulTan@nowhere.com");

        // Test getters
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());
    }
}
