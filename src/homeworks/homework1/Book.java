package homeworks.homework1;

import java.util.List;

public class Book {
    private int id;
    private String title;
    private String author;
    private double price;
    private int quantity;

    public Book(int id, String title, String author, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Title: " + title +
                ", Author: " + author +
                ", Price: " + price +
                ", Quantity: " + quantity;
    }

    public static class Main {
        public static void main(String[] args) {
            BookStorage storage = new BookStorage();

            storage.addBook(new Book(1, "Java Basics", "John Doe", 150.0, 10));
            storage.addBook(new Book(2, "Advanced Java", "Jane Smith", 220.0, 5));
            storage.addBook(new Book(3, "Spring Boot", "Alice Brown", 180.0, 7));

            System.out.println("All Books in Storage:");
            storage.printAllBooks();

            System.out.println("\n delete book's ID=2");
            storage.deleteBookById(2);
            storage.printAllBooks();

            System.out.println("\n Books 100-200 prices");
            List<Book> filteredBooks = storage.searchBooksByPriceRange(100, 200);
            for (Book book : filteredBooks) {
                System.out.println(book);
            }
        }
    }
}

