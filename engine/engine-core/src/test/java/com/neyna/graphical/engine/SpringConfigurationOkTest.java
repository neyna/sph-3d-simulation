package com.neyna.graphical.engine;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class SpringConfigurationOkTest {

    @BeforeClass
    public static void initLog() {
       System.getProperties().put("log4j.configurationFile", "log4j-test.xml");
    }

    @Test
    public void emptyTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext(     "basicSpringTestContext.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        assertEquals("Hello ! Neyna", obj.getHello());
    }
}
