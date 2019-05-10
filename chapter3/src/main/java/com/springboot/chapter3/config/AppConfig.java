package com.springboot.chapter3.config;

import com.springboot.chapter3.condition.DatabaseConditional;
import com.springboot.chapter3.pojo.DataBaseProperties;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration //標明為Spring的Java配置文件
//無配置只會掃描同個包或子包
@ComponentScan(value = "com.springboot.chapter3.*")
//配置文件中定義掃描規則
public class AppConfig {

    final DataBaseProperties dataBaseProperties;

    @Autowired
    public AppConfig(final DataBaseProperties dataBaseProperties) {
        this.dataBaseProperties = dataBaseProperties;
    }

    @Bean(name = "resource", destroyMethod = "close")
    @Conditional(DatabaseConditional.class)
    public DataSource getDevDataSource(
            @Value("${database.driverName}") String driver,
            @Value("${database.url}") String url,
            @Value("${database.username}") String username,
            @Value("${database.password}") String password

    ) {
        System.out.println("DB prop: " + this.dataBaseProperties);

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
