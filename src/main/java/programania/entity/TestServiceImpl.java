package programania.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class TestServiceImpl implements TestService {

    public void test() {
        System.out.println("I am TestServiceImpl");
    }

}
