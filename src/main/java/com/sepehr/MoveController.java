package com.sepehr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MoveController {
    @RequestMapping("movetopage1")
    public String toPage1(){
        return "page1";
    }

    @RequestMapping("movetopage2")
    public String toPage2(){
        return "page2";
    }
}
