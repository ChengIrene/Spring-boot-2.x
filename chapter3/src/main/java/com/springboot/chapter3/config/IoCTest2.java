package com.springboot.chapter3.config;

import com.springboot.chapter3.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class IoCTest2 {

    private static Logger log =  LogManager.getLogger(IoCTest2.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = ctx.getBean(User.class);
        log.info(user.getId());

    }
}
