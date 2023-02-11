package programania;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programania.entity.Book;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();
        uniLibrary.addBook("Travis", book);
        uniLibrary.addMagazine();

//        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
//        uniLibrary.getBook();
//        uniLibrary.getMagazine();

//        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
//        uniLibrary.getBook();
//        uniLibrary.returnMagazine();
//        uniLibrary.addBook();

//        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
//        uniLibrary.getBook();
//        uniLibrary.getMagazine();
    }
}
