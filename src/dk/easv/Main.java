package  dk.easv;
public class Main
{
    public static void main(String[] args)
    {
        // Test the implementation
        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction"));
        catalog.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction"));
        catalog.addBook(new Book("1984", "George Orwell", "Science Fiction"));

        BookIterator iterator = catalog.createIterator();

        while (iterator.hasNext())
        {
            Book book = iterator.next();
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getGenre() + ")");
        }
    }
}
