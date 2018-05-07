package com.utils;

// import org.apache.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志相关代码
 *     一:Log4j学习
 *     二:Slf4j与Log4j联合开发
 *     三:jcabi实现针对函数进行日志记录
 */

//public class LoggerDemo {
//    /**
//     * 创建Logger对象
//     */
//    public static Logger logger = Logger.getLogger(LoggerDemo.class);
//
//    public void showLog() {
//        logger.info("Hello,I am Log4j");
//    }
//
//    public static void main(String[] args) {
//        LoggerDemo lgd = new LoggerDemo();
//        lgd.showLog();
//    }
//}

public class LoggerDemo {
    public static Logger logger = LoggerFactory.getLogger(LoggerDemo.class);

    public static void main(String[] args) {
        logger.info("I am slf4j log......");
    }
}