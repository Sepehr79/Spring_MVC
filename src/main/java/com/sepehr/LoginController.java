package com.sepehr;

import beans.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    @RequestMapping("login")
    public String login(@RequestParam("name")String rName, @RequestParam("password")String rPassword , Model model){

        if (rName.equals("sepehr") && rPassword.equals("1234")){
            model.addAttribute("message", "You have successfully login");
            model.addAttribute("color", "green");
        }else {
            model.addAttribute("message", "Sorry wrong username or password");
            model.addAttribute("color", "red");
        }

        return "result";
    }

    @RequestMapping("sign_up")
    public String signUp(@ModelAttribute("personModel")Person person){
        return "signup_result";
    }
}
