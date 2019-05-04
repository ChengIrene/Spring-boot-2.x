package com.springboot.chapter3.main;

import com.springboot.chapter3.config.AppConfig;
import com.springboot.chapter3.pojo.BusinessPerson;
import com.springboot.chapter3.pojo.definition.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import javax.sql.DataSource;
import java.sql.SQLException;


public class IoCTest {

    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext ctx = null;
        try{
            ctx = new AnnotationConfigApplicationContext(AppConfig.class);
            DataSource ds = ctx.getBean(DataSource.class); //用名稱+類型
          // User user = ctx.getBean(User.class);  //用類型去取得
            System.out.println(ds.getConnection().getMetaData().getDatabaseProductName());

            Person person = ctx.getBean(BusinessPerson.class);
            person.service();

        } finally {
            if(ctx != null) {
                ctx.close();  //關閉IoC容器
            }
        }



    }

}
