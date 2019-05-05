package com.springboot.chapter3.pojo;

import com.springboot.chapter3.pojo.definition.Animal;
import com.springboot.chapter3.pojo.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//人類實現類

@Component
public class BusinessPerson implements Person {

    public BusinessPerson() {
        System.out.println("BusinessPerson 構造方法被調用......");
    }

    //人要持有一個動物
    private Animal animal = null;

    //也可以用在建構子參數上(setAnimal的@Qualifier優先?)
    public BusinessPerson(@Autowired @Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    @Autowired @Qualifier("dog")
    public void setAnimal(Animal animal) {
        System.out.println("延遲依賴注入");
        this.animal = animal;
    }

}
