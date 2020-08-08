package com.nosusume.provider.demo;

import com.nosusume.demo.DemoAPI;

public class ProviderImpl implements DemoAPI {
    @Override
    public String sayHello() {
        return "Hello, World!";
    }
}
