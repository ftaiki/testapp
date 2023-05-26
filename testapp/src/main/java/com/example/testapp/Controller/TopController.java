package com.example.testapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {
    
    @GetMapping("/")
    public static String login(){
        return "index";
    }

    @GetMapping("/index")
    public static String top(){
        //for commit comment<3
        return "index";
    } 
}
