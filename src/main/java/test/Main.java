package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        twoSingletonBeans();
    }

    /**
     * This is an example for creating of two beans with scope Singleton in two contexts
     */
    private static void twoSingletonBeans() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");

        SingletonBean bean1 = classPathXmlApplicationContext.getBean("xmlBean", SingletonBean.class);
        System.out.println(bean1.getValue());
        System.out.println("-------------------------------------");

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(TestConfig.class);
        SingletonBean bean2 = annotationConfigApplicationContext.getBean("annotationBean", SingletonBean.class);
        System.out.println(bean2.getValue());
    }

}
