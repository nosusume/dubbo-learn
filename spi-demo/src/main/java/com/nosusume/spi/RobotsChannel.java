package com.nosusume.spi;

public class RobotsChannel implements IRobot {
    @Override
    public void sayHello() {
        System.out.println("Roboko-san");
    }
}
