package programania;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programania.entity.Book;
import programania.entity.Student;

import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println("An exception have been caught : " + e);
        }

//        University university = context.getBean("university", University.class);
//        university.addStudents();
//        List<Student> students = university.getStudents();
//        System.out.println(students);

        context.close();
    }
}
