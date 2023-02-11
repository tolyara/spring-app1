package programania;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public void getBook() {
        System.out.println("Getting a book");
    }

    public void getMagazine() {
        System.out.println("Getting a magazine");
    }

}
