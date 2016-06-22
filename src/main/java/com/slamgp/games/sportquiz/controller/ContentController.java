package com.slamgp.games.sportquiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slamgp.games.sportquiz.model.Prototype;

@Controller
@RequestMapping("/content")
public class ContentController {
    public static final String CONTENT_VIEW = "div_content";
    @Autowired
    Prototype prototype;

    @RequestMapping(method = RequestMethod.GET)
    public String showWelcome(ModelMap model) {
        model.addAttribute("response", "hello this ajax test response");
        return CONTENT_VIEW;
    }
    
    @RequestMapping(method = RequestMethod.POST,  produces="application/json")
    @ResponseBody
    public Prototype showWelcomePOST(ModelMap model) {
        prototype.setName("koka");
        return prototype;
    }
}
