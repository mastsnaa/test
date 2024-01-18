package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class User {
    public String createUser(String username){
        return username;
    }
    public boolean deleteUser(String username){
        return true;
    }
}
