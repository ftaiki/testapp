package com.example.testapp.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.testapp.Data.UserData;

@Repository
public class MathProbRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public UserData selectOne(String userId){

        String sql = "SELCT * FROM users WHERE user_id = ?";
        Map<String, Object> oneUser = jdbcTemplate.queryForMap(sql, userId);

        UserData userData = new UserData();


        return userData;
    }

}
