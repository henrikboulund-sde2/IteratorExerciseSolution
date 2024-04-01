package dk.easv;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog
{
    private List<Book> books;

    public LibraryCatalog()
    {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        books.add(book);
    }

    public BookIterator createIterator()
    {
        return new LibraryBookIterator(books);
    }
}
