package com.springboot.chapter3.pojo;

import com.springboot.chapter3.pojo.definition.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  //當IoC容器找到多個類型的時候,優先把該類注入
public class Cat implements Animal {

    @Override
    public void use() {
        System.out.println("貓【" + Cat.class.getSimpleName() + "】 是來抓蟑螂的。");
    }

}
