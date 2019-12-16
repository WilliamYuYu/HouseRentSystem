package com.pengesoft.fwzlxt;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HitsApplication {

    private static Logger logger = Logger.getLogger(HitsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HitsApplication.class, args);
        logger.info(HitsApplication.class.getSimpleName() + " start success!");
    }
}
