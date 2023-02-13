package programania;

import org.springframework.stereotype.Component;
import programania.entity.Student;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<Student>();

    public void addStudents() {
        Student student1 = new Student("Student1", 4, 6.5);
        Student student2 = new Student("Student2", 2, 7.3);
        Student student3 = new Student("Student3", 1, 8.7);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("getStudents() starting");
//        System.out.println(students.get(3));

        System.out.print("Info about students: ");
        System.out.println(students);
        return students;
    }

}
