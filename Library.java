import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<bookss> libbooks;
    private List<member> libmembers;

    public Library(List<bookss> books){
        this.libbooks=books;
        this.libmembers=new ArrayList<>();
    }

    public void addBook(bookss book) {
        libbooks.add(book);
        System.out.println(book.getTitle() + " has been added to the library.");
    }

    public void removeBook(bookss book) {
        if (libbooks.contains(book)) {
            libbooks.remove(book);
            System.out.println(book.getTitle() + " has been removed from the library.");
        } else {
            System.out.println(book.getTitle() + " not found in the library.");
        }
    }

    public void registerMember(member member) {
        libmembers.add(member);
        System.out.println(member.getMembername() + " has been registered as a member.");
    }

    public void removeMember(member member) {
        if (libmembers.contains(member)) {
            libmembers.remove(member);
            System.out.println(member.getMembername() + " has been removed from the library.");
        } else {
            System.out.println(member.getMembername() + " is not registered in the library.");
        }
    }

    public bookss findBookByTitle(String title) {
        for (bookss book : libbooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + title);
                return book;
            }
        }
        System.out.println("Book not found: " + title);
        return null;
    }

    public void listAvailableBooks() {
        System.out.println("Available books in the library:");
        for (bookss book : libbooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }






}
