package homeworks.homework1;

import java.util.ArrayList;
import java.util.List;

public class BookStorage {
    private List<Book> books;

    public BookStorage() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBookById(int id) {
        books.removeIf(book -> book.getId() == id);
    }

    public List<Book> searchBooksByPriceRange(double minPrice, double maxPrice) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPrice() >= minPrice && book.getPrice() <= maxPrice) {
                result.add(book);
            }
        }
        return result;
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

