package com.example.testapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MathProbController {
    
    @GetMapping("/mathprob")
    public String mathProblem(){
        return "mathprob";
    }

    @PostMapping("/mathprob")
    public String calcBirthday(){
        
        return "mathprob";
    }
}
