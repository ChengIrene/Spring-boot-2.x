package com.springboot.chapter3.config;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration //標明為Spring的Java配置文件
//無配置只會掃描同個包或子包
@ComponentScan(value = "com.springboot.chapter3.*", includeFilters = @Filter(classes = Indexed.class)/*, lazyInit = true*/)
//@Resource  //Java EE 的註解,非Spring (與@Qualifier的差異為面試題) 建議用Spring的註解
//配置文件中定義掃描規則
public class AppConfig {

    //@Bean(name = "user")
    //public User initUser() {
    //    User user = new User();
    //    user.setId(1L);
    //    user.setUserName("user_name_1");
    //    user.setNote("note_1");
    //    return user;
    //}

    //@Bean(name = "user2")
    //public User initUser2() {
    //    User user = new User();
    //    user.setId(1L);
    //    user.setUserName("user_name_2");
    //    user.setNote("note_2");
    //    return user;
    //}

    @Bean(name = "dataSource")
    public DataSource getDataSource() {
        Properties props = new Properties();
        props.setProperty("driver", "com.mysql.jdbc.Driver");
        props.setProperty("url", "jdbc:mysql://localhost:3306/spring_boot_chapter3?serverTimezone=GMT%2B8");
        props.setProperty("username", "root");
        props.setProperty("password", "88776542");
        DataSource dataSource = null;

        try {

            dataSource = BasicDataSourceFactory.createDataSource(props);

        } catch (Exception e) {

            e.printStackTrace();

        }
        return dataSource;

    }

}
