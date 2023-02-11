package programania.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import programania.entity.Book;
import programania.entity.Student;

import java.util.List;

@Component
@Aspect
@Order(100)
public class UnivercityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("Logging of getStudents(), before");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterGetStudentsLoggingAdvice(List<Student> students) {
        for (Student student : students) {
            student.setFullName("Mr. " + student.getFullName());
            student.setAvgGrade(student.getAvgGrade() + 1);
        }

        System.out.println("Logging of getStudents(), after");
    }

}
