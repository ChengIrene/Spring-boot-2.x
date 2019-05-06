package com.springboot.chapter3.main;

import com.springboot.chapter3.config.AppConfig;
import com.springboot.chapter3.pojo.definition.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.sql.SQLException;

@PropertySource("classpath:application.properties")
public class IoCTest {

    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext ctx = null;

        try{
            //new一個初始化容器
            ctx = new AnnotationConfigApplicationContext(AppConfig.class);  //Bean從這個配置文件來
            ctx.refresh();
            DataSource ds = ctx.getBean(DataSource.class); //用名稱+類型
            // User user = ctx.getBean(User.class);  //用類型去取得
            System.out.println(ds.getConnection().getMetaData().getDatabaseProductName());

            Person person = ctx.getBean(Person.class);  //getBean()方法在默認情況下去進行初始化BusinessPerson
            person.service();

        } finally {
            if(ctx != null) {
                ctx.close();  //關閉IoC容器
            }
        }



    }

}
