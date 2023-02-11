package programania;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public void getBook() {
        System.out.println("Getting a book");
    }

    public void returnBook() {
        System.out.println("Returning a book");
    }

    public void getMagazine() {
        System.out.println("Getting a magazine");
    }

    public void returnMagazine() {
        System.out.println("Returning a magazine");
    }

    public void addBook() {
        System.out.println("Adding a book");
    }

    public void addMagazine() {
        System.out.println("Adding a magazine");
    }

}
