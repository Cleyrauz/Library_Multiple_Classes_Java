import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1, book2, book3, book4;

    @Before
    public void setup(){
        library = new Library(3);
        book1 = new Book("The little prince", "Antoine de Saint-Exupery", "fantasy");
        book2 = new Book("1984", "George Orwell", "action");
        book3 = new Book("El Alquimista", "Paulo Cohelo", "romance");
        book4 = new Book("El Simbolo Oculto", "Dan Brown", "fiction");
    }

    @Test
    public void shouldGetBooksCount(){
      assertEquals(0, library.getBooksCount());
    }

    @Test
    public void shouldAddABookToTheLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.getBooksCount());
    }

    @Test
    public void shouldHasALimitOfBooks(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.getBooksCount());
    }
}
