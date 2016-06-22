package com.slamgp.games.sportquiz.service.rest;

import java.io.File;

public class Test {

    public static void main(String[] args) {
        File file = new File("src/main/webapp/resources/music/fon.mp3");
        if (file.exists()) {
            System.out.println("exist");
        } else {
            System.out.println("hui"); 
        }
    }

}
