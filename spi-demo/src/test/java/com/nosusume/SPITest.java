package com.nosusume;

import com.nosusume.spi.IRobot;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

import java.util.ServiceLoader;

public class SPITest {
    @Test
    public void testSPI() {
        ServiceLoader<IRobot> sl = ServiceLoader.load(IRobot.class);
        sl.forEach(IRobot::sayHello);
    }

    @Test
    public void testDubboSPI() {
        ExtensionLoader<IRobot> el = ExtensionLoader.getExtensionLoader(IRobot.class);
        IRobot ai = el.getExtension("aiChannel");
        ai.sayHello();
        IRobot ro = el.getExtension("robotsChannel");
        ro.sayHello();
    }
}
