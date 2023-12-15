package ProjectTwo;

public class Book {
    private final String title;
    private final String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book '" + title + "' by " + author + " has been borrowed.");
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book '" + title + "' by " + author + " has been returned.");
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
