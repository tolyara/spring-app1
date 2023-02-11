package programania.pointcuts;

import org.aspectj.lang.annotation.Pointcut;

public class PointCut {

//    @Pointcut("execution(* get*())")
//    public void allGetMethods() {}

    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {}

}


