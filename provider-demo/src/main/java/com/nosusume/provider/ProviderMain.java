package com.nosusume.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/dubbo/dubbo-demo-provider.xml");
        context.start();

        System.in.read();
    }
}
