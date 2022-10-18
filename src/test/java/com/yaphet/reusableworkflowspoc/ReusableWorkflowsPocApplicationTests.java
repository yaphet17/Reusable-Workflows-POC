package com.yaphet.reusableworkflowspoc;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReusableWorkflowsPocApplicationTests {

    @Test
    void contextLoads() {
        Set<String> testSet = Set.of("Hello Java");
        System.out.println("==========================" + testSet.size() + "==================================");
    }

}
