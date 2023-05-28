package com.example.testapp.Entity;

import java.util.Date;

import lombok.Data;

@Data
public class UserEntity {
    private int userId;
    private String userName;
    private String password;
    private String mail;
    private Date dateTime;  
}
