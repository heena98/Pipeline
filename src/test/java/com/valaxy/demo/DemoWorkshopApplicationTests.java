package com.valaxy.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = DemoWorkshopApplication.class)
class DemoWorkshopApplicationTests {

    @Test
    void contextLoads() {
        List<String> li = new ArrayList<>();
    }
}
