package com.nocoder.community;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @description:
 * @author: hanmingbao
 * @create: 2022-03-22 09:00
 **/
@SpringBootTest
public class LoggerTest {

    //实例化
    public  static  final Logger  logger= LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public  void testLogger(){
        String name = logger.getName();
        System.out.println("日志名字"+name);
        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
    }
}
