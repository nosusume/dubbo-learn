package com.nosusume.consumer;

import com.nosusume.demo.DemoAPI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/dubbo/dubbo-demo-consumer.xml");
        context.start();
        DemoAPI demoAPI = (DemoAPI) context.getBean("demoService");
        System.out.println(demoAPI.sayHello());
    }
}
