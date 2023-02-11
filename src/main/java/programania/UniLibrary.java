package programania;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public void getBook() {
        System.out.println("Getting a book");
        printLine();
    }

    public void returnBook() {
        System.out.println("Returning a book");
        printLine();
    }

    public void getMagazine() {
        System.out.println("Getting a magazine");
        printLine();
    }

    public void returnMagazine() {
        System.out.println("Returning a magazine");
        printLine();
    }

    public void addBook(String librarian, Book book) {
        System.out.println("Adding a book");
        printLine();
    }

    public void addMagazine() {
        System.out.println("Adding a magazine");
        printLine();
    }

    private void printLine() {
        System.out.println("--------------------------------------------------");
    }

}
