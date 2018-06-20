import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book1;

    @Before
    public void setup() {
        borrower = new Borrower();
        book1 = new Book("The little prince", "Antoine de Saint-Exupery", "fantasy");
    }

    @Test
    public void ShouldBorrowaBook(){
        borrower.borrowBook(book1);
        assertEquals(1, borrower.getBorrowerBooks().size());
    }
}
