import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setup(){
        book = new Book("The little prince", "Antoine de Saint-Exupery", "fantasy");
    }

    @Test
    public void bookHasATitle(){
        assertEquals("The little prince", book.getTitle());
    }

    @Test
    public void bookHasAAuthor(){
        assertEquals("Antoine de Saint-Exupery", book.getAuthor());
    }

    @Test
    public void bookHasAGender(){
        assertEquals("fantasy", book.getGender());
    }

}
