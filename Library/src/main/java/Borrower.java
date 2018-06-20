import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowerBooks;

    public Borrower() {
        this.borrowerBooks = new ArrayList<Book>();
    }

    public void borrowBook(Book book){
        this.borrowerBooks.add(book);
    }

    public ArrayList<Book> getBorrowerBooks() {
        return borrowerBooks;
    }
}

