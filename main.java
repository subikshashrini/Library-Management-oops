import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Create some books
        bookss book1 = new bookss("Java Programming", "John Doe", 2020);
        bookss book2 = new bookss("Effective Java", "Joshua Bloch", 2018);
        bookss book3 = new bookss("Design Patterns", "Erich Gamma", 1994);

        // Create a list of books for the library
        List<bookss> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        // Initialize the library
        Library library = new Library(books);

        // Create some members
        member member1 = new member("SUBI", 1);
        member member2 = new member("SHRI",2);

        // Register members
        library.registerMember(member1);
        library.registerMember(member2);

        // List available books
        library.listAvailableBooks();

        // Borrow a book
        member1.borrowbooks(book1);
        library.removeBook(book1); // This should not happen if the book is borrowed

        // List available books after borrowing
        library.listAvailableBooks();

        // Return a book
        member1.removebooks(book1);
        library.addBook(book1); // Add the book back to the library

        // List available books after returning
        library.listAvailableBooks();

        // Find a book by title
        bookss foundBook = library.findBookByTitle("Effective Java");
        if (foundBook != null) {
            System.out.println("Found book: " + foundBook);
        }

        // Remove a member
        library.removeMember(member2);
    }
}
