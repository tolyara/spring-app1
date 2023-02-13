package programania;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programania.entity.Student;

import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        System.out.println("main started");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = uniLibrary.returnBook();
        System.out.println("Book '" + bookName + "' was returned to the library");

        context.close();
        System.out.println("main finished");
    }
}
