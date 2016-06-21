package com.slamgp.games.sportquiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/content")
public class ContentController {
    public static final String CONTENT_VIEW = "div_content";

    @RequestMapping(method = RequestMethod.GET)
    public String showWelcome(ModelMap model) {
        model.addAttribute("response", "hello this ajax test response");
        return CONTENT_VIEW;
    }
}
