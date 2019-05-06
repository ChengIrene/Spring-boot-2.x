package com.springboot.chapter3.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseProperties {

    @Value("${database.driverName}")
    private String driverName;

    @Value("${database.url}")
    private String url;

    @Value("${database.username}")
    private String username;

    @Value("${database.password}")
    private String password;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        System.out.println("get driver name: " + driverName);
        this.driverName = driverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        System.out.println(url);
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println(username);
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        System.out.println(password);
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataBaseProperties{" + "driverName='" + driverName + '\'' + ", url='" + url + '\'' + ", username='" + username + '\'' + ", password='" + password + '\'' + '}';
    }

}
