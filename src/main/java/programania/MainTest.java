package programania;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programania.entity.ClientServiceImpl;
import programania.entity.Student;
import programania.entity.TestService;

import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        ClientServiceImpl clientServiceImpl = context.getBean("clientServiceImpl", ClientServiceImpl.class);
        clientServiceImpl.test();

        context.close();
    }
}
