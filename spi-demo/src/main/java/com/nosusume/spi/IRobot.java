package com.nosusume.spi;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface IRobot {
    void sayHello();
}
