package programania.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around logging before returning a book");

        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
//        Object targetMethodResult = "Book2";
        long end = System.currentTimeMillis();

        System.out.println("Around logging after returning a book");
        System.out.println("Time of work " + (end - begin) + " millis");
        return targetMethodResult;
    }

}
