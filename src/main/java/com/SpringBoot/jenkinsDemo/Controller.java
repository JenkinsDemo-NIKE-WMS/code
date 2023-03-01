package com.SpringBoot.jenkinsDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/jenkinsDemo")
    public String jenkinsDemo(){
        return "Hi Team, welcome to our jenkins demo";
    }
}
