package ProjectTwo;

public class Member {

    public Member(String memberName) {
    }

    public void borrowBook(Book book) {
        book.borrowBook();
    }

    public void returnBook(Book book) {
        book.returnBook();
    }

}
