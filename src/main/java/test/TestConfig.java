package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("test")
@PropertySource("classpath:test.properties")
public class TestConfig {

    @Bean
    public SingletonBean singletonBean() {
        SingletonBean singletonBean = new SingletonBean();
        singletonBean.setValue("configValue");
        return singletonBean;
    }

}
