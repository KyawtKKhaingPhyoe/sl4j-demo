package com.example.sl4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;

@SpringBootApplication
public class Sl4jDemoApplication implements CommandLineRunner {

    private Logger testLogger = LoggerFactory.getLogger(Sl4jDemoApplication.class.getName());

    private Logger loggerA= LoggerFactory.getLogger("app.service.a");
    private Logger loggerB= LoggerFactory.getLogger("app.service.b");
    private Logger loggerC= LoggerFactory.getLogger("app.service.c");
    private Logger loggerD= LoggerFactory.getLogger("app.service.d");
    private Logger loggerE= LoggerFactory.getLogger("app.service.e");
    private Logger loggerF= LoggerFactory.getLogger("app.service.f");


    public static void main(String[] args) {
        SpringApplication.run(Sl4jDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        loggerA.info("info level in logger a");
        loggerA.warn("warning level in logger a");
        loggerA.error("error level in logger a");

        loggerB.info("info level in logger b");
        loggerB.warn("warning level in logger b");
        loggerB.error("error level in logger b");

        loggerC.info("info level in logger c");
        loggerC.warn("warning level in logger c");
        loggerC.error("error level in logger c");

        loggerD.info("info level in logger d");
        loggerD.warn("warning level in logger d");
        loggerD.error("error level in logger d");

        loggerE.info("info level in logger e");
        loggerE.warn("warning level in logger e");
        loggerE.error("error level in logger e");

        loggerF.info("info level in logger f");
        loggerF.warn("warning level in logger f");
        loggerF.error("error level in logger f");
        loggerF.trace("trace level in logger f");
        loggerF.debug("debug level in logger f");

        testLogger.debug("debug level in logger");

    }
}
