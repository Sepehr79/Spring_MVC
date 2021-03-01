package com.sepehr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Dispatcher {
    @RequestMapping("/")
    public String display(){
        return "main";
    }
}
