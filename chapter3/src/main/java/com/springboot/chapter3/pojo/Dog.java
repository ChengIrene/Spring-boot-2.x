package com.springboot.chapter3.pojo;

import com.springboot.chapter3.pojo.definition.Animal;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog implements Animal, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    @PostConstruct
    public void myInit() {
        System.out.println("【" + this.getClass().getSimpleName() + "】 @PostConstruct自定義初始方法");
    }

    @PreDestroy
    public void myDestroy() {
        System.out.println("【" + this.getClass().getSimpleName() + "】 @PreDestroy自定義銷毀方法");
    }

    @Override
    public void use() {
        System.out.println("狗【" + Dog.class.getSimpleName() + "】 是來咬壞人的。");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware的setBeanFactory方法");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameAware的setBeanName方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean的destroy方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean的afterPropertiesSet方法");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware的setApplicationContext方法");
    }
}
