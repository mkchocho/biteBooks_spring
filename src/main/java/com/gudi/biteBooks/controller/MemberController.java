package com.gudi.biteBooks.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.gudi.biteBooks.logic.MemberLogic;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/member/*")
public class MemberController {
    Logger logger = LoggerFactory.getLogger(MemberController.class);
    @Autowired
    private MemberLogic memberLogic = null;
    
    @GetMapping("memberList")
    public String memberList(@RequestParam Map<String, Object> pMap, Model model){
        List<Map<String,Object>> mList = null;
        mList = memberLogic.memberList(pMap);
        model.addAttribute("mList", mList);
        return "member/memberList";
    }
    

}
