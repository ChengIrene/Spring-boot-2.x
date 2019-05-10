package com.springboot.chapter3.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DatabaseConditional implements Condition {

    /*
    *  數據庫裝配條件
    *
    *  @param context 條件上下文
    *  @param metadata 註釋類型的元數據
    *  @return true 裝配 Bean 否則不裝配
    *
    * */

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //取出環境配置
        Environment env = context.getEnvironment();
        //判斷屬性文件是否存在對應的數據位置
        return env.containsProperty("database.driverName")
                && env.containsProperty("database.username")
                && env.containsProperty("database.password");

    }

}
