package programania.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import programania.entity.Book;

@Component
@Aspect
@Order(100)
public class UnivercityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("Logging of getStudents(), before");
    }

    @AfterReturning("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("Logging of getStudents(), after");
    }

}
