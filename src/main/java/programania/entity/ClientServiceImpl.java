package programania.entity;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ClientServiceImpl {

    private final TestService testService;

    public ClientServiceImpl(TestService testService) {
        this.testService = testService;
    }

    public void test() {
        testService.test();
    }

}
