package com.slamgp.games.sportquiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slamgp.games.sportquiz.service.Router;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    @Autowired
    Router router;
 
    @RequestMapping(method = RequestMethod.GET)
    public String showWelcome(ModelMap model) {
        model.addAttribute("name", router.getProtypeName());
        return router.getMessage();
    }
}
