package com.neyna.graphical.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    //static Logger logger = LogManager.getLogger(App.class);

    static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(     "applicationContext.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();

        LOG.info("TEST");
    }
}
