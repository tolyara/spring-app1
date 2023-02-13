package programania;

import org.springframework.context.annotation.*;
import programania.entity.TestService;
import programania.entity.TestServiceImpl;
import programania.entity.TestServiceImpl2;

@Configuration
@ComponentScan("programania")
@EnableAspectJAutoProxy
public class MyConfig {

//    @Bean
//    public TestService testService() {
//        return new TestServiceImpl();
//    }
//
//    @Bean
//    @Primary
//    public TestService testService2() {
//        return new TestServiceImpl2();
//    }

}
