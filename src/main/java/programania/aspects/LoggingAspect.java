package programania.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("programania.pointcuts.PointCut.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("Logging of getting a book");
    }

}
