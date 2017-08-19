package com.neyna.graphical.engine;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
    static final Logger LOG = LoggerFactory.getLogger(HelloWorld.class);

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        LOG.info("Hello ! " + name);
    }
}
