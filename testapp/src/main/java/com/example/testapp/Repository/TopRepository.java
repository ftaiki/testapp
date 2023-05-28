package com.example.testapp.Repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.testapp.Entity.UserEntity;
@Repository
public class TopRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public UserEntity selectOne(int userId){
        String sql = "SELECT * FROM users WHERE user_id=?";

        Map<String, Object> map = jdbcTemplate.queryForMap("SELECT * FROM users WHERE user_id = ?", userId);
        
        UserEntity user = new UserEntity();

        user.setUserId((int) map.get("user_id"));

        int x = 1;
        return user;
    }

}
