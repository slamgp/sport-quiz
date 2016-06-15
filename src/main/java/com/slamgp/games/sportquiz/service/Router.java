package com.slamgp.games.sportquiz.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.slamgp.games.sportquiz.model.Prototype;

public class Router {
    @Autowired
    Prototype prototype;

    public String getMessage() {
        String fileName = "welcome";
        int idSheet = (int)(Math.random()*3);
        if (idSheet > 0) {
            fileName = fileName + idSheet;
        }
        return fileName;
    }
    
    public String getProtypeName() {
        return prototype.getName();
    }
}
