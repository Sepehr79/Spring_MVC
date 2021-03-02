package com.sepehr;

import beans.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping("sign_up_page")
    public String toSignup(Model model){

        Person person = new Person();
        model.addAttribute("personModel", person);

        return "spring_form_tag";
    }
}
