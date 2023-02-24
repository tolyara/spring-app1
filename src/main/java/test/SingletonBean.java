package test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("annotationBean")
@Scope("singleton")
public class SingletonBean {

//    @Value("${value1}")
    private String value = "defaultValue";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
