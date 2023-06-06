package com.example.testapp.Data;

import java.util.Date;

import lombok.Data;

@Data
public class UserData {
    private int userId;
    private String userName;
    private String password;
    private String mail;
    private Date dateTime; 

}
