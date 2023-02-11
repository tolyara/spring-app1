package programania.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(300)
public class ExceptionHandlingAspect {

    @Before("programania.pointcuts.PointCut.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("Handling exception of getting a book");
    }

}
