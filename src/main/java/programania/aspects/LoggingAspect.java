package programania.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(100)
public class LoggingAspect {

    @Before("programania.pointcuts.PointCut.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint jp) {
        MethodSignature methodSignature = (MethodSignature) jp.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("getMethod = " + methodSignature.getMethod());
        System.out.println("getReturnType = " + methodSignature.getReturnType());
        System.out.println("getName = " + methodSignature.getName());

        System.out.println("Logging of getting a book");
    }

//    @Before("programania.pointcuts.PointCut.allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("Logging of getting a book");
//    }

}
