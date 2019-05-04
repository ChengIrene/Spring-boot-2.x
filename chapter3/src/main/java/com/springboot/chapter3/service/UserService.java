package com.springboot.chapter3.service;

import com.springboot.chapter3.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void PrintUser(User user) {
        System.out.println("編號: " + user.getId());
        System.out.println("用戶名稱: " + user.getUserName());
        System.out.println("備註: " + user.getNote());
    }
}
