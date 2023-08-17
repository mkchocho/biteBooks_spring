package com.gudi.biteBooks.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gudi.biteBooks.logic.AuthLogic;

@Controller
@RequestMapping("/auth/*")
public class AuthController {
    Logger logger = LoggerFactory.getLogger(AuthController.class);
    @Autowired
    private AuthLogic authLogic = null;
            
    //insert method here 

}
