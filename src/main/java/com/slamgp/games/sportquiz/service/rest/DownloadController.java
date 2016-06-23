package com.slamgp.games.sportquiz.service.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mp3")
public class DownloadController {

    @RequestMapping(method = RequestMethod.GET)
    public void  getFile(HttpServletRequest request, HttpServletResponse response) {
       String  filePath = "/resources/music/fon.mp3";
       try {
           ServletContext context = request.getServletContext();

           String appPath = context.getRealPath("");
           String fullPath =  appPath + filePath;
           File file = new File(fullPath);

           FileInputStream inputStream = new FileInputStream(file);

           byte[] targetArray = new byte[inputStream.available()];
           inputStream.read(targetArray);
           response.getOutputStream().write(targetArray);

           inputStream.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
