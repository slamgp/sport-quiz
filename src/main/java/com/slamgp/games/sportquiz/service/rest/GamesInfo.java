package com.slamgp.games.sportquiz.service.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class GamesInfo {
    @RequestMapping(method = RequestMethod.GET)
    public String SayXMLResponse() {
        return "<?xml version=\"1.0\"?>" + "<name> Sport Quiz </name> <version> 1.0 </version>";
    }
}
