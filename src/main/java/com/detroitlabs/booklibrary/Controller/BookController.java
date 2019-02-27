package com.detroitlabs.booklibrary.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    @RequestMapping("/")
    public String showHomePage(){
        return "home";
    }

}
