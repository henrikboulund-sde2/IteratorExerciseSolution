package dk.easv;

import java.util.List;

public class LibraryBookIterator implements BookIterator
{
    private List<Book> books;
    private int position;

    public LibraryBookIterator(List<Book> books)
    {
        this.books = books;
        this.position = 0;
    }

    @Override
    public boolean hasNext()
    {
        return position < books.size();
    }

    @Override
    public Book next()
    {
        if (!hasNext())
        {
            throw new IndexOutOfBoundsException("No more books available");
        }
        return books.get(position++);
    }
}
