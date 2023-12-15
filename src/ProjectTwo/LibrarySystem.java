package ProjectTwo;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        Member member1 = new Member("Alice");
        Member member2 = new Member("Bob");

        library.displayAvailableBooks();

        Book bookToBorrow = library.getBooks().get(0);
        member1.borrowBook(bookToBorrow);

        library.displayAvailableBooks();

        Book bookToReturn = library.getBooks().get(1);
        member1.returnBook(bookToReturn);

        library.displayAvailableBooks();
    }
}
