package com.gudi.biteBooks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/include/*")
public class pageController {

    @GetMapping("mainHeader")
    public String MainHeader(){
        return"common/mainHeader";
    }
}
