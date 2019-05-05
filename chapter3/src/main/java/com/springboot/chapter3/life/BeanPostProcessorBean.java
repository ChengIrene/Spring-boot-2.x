package com.springboot.chapter3.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

//後置Bean初始化器
@Component
public class BeanPostProcessorBean implements BeanPostProcessor {

    //Spring8以後就沒有可以實踐的方法
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor的postProcessBeforeInitialization方法【" + beanName + "】【" + bean.getClass().getName() + "】");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor的postProcessAfterInitialization方法【" + beanName + "】【" + bean.getClass().getName() + "】");
        return bean;
    }

}
