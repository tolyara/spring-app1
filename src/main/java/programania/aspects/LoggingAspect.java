package programania.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import programania.entity.Book;

@Component
@Aspect
@Order(100)
public class LoggingAspect {

    @Before("programania.pointcuts.PointCut.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint jp) {
        MethodSignature methodSignature = (MethodSignature) jp.getSignature();
//        System.out.println("methodSignature = " + methodSignature);
//        System.out.println("getMethod = " + methodSignature.getMethod());
//        System.out.println("getReturnType = " + methodSignature.getReturnType());
//        System.out.println("getName = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] args = jp.getArgs();
            for (Object o : args) {
                if (o instanceof Book) {
                    Book book = (Book) o;
                    System.out.print("name = " + book.getName() + ", ");
                    System.out.print("author = " + book.getAuthor() + ", ");
                    System.out.println("year = " + book.getYear());
                } else if (o instanceof String) {
                    System.out.println("librarian = " + o);
                }
            }
        }

        System.out.println("Logging of adding a book/magazine");
    }

//    @Before("programania.pointcuts.PointCut.allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("Logging of getting a book");
//    }

}
