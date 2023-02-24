package test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("test")
@PropertySource("classpath:test.properties")
public class TestConfig {
}
