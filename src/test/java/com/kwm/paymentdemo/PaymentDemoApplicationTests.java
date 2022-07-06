package com.kwm.paymentdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PaymentDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 测试输出方法 输出char类型数组结果   直接遍历
     */
    @Test
    void testSoutsCharArr(){
        System.out.println(new char[]{'a','b','c'});
    }

}
