package com.slamgp.games.sportquiz.service.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slamgp.games.sportquiz.model.GamesInfo;

@RestController
@RequestMapping("/info")
public class GamesInfoRest {
    @Autowired
    GamesInfo gamesInfo;
    @RequestMapping(method = RequestMethod.GET)
    public GamesInfo SayXMLResponse() {
        gamesInfo.setName("Sport Quiz");
        gamesInfo.setVersion("1.0");
        gamesInfo.setAutor("Panchenko Evgen");
        return gamesInfo;
    }
}
