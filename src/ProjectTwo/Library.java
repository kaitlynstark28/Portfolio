package ProjectTwo;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
        initializeLibrary();
    }

    private void initializeLibrary() {
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book("1984", "George Orwell"));
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books in the Library:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
