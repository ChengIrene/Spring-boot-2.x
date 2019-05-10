package com.springboot.chapter3.pojo;

import com.springboot.chapter3.pojo.definition.Animal;

public class Squirrel implements Animal {
    @Override
    public void use() {
        System.out.println("松鼠可以採集松果");
    }
}
