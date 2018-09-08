package com.logDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBackTest {

    private static final Logger logger = LoggerFactory.getLogger(LogBackTest.class);

    public static void main(String[] args) {
        logger.info("logback 成功了");
        logger.warn("logback 警告");
        logger.error("logback 错误输出");
        System.out.println("success");
    }
}
