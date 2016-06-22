package com.slamgp.games.sportquiz.service.rest;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mp3")
public class DownloadController {

    @RequestMapping(method = RequestMethod.GET)
    public void  getFile(HttpServletResponse response) {
       File file = new File("src/main/webapp/resources/music/fon.jpg");
       String mimeType = "image/jpeg";
       if(file.exists()) {
           transferFile(response, file, mimeType);
       } else  {
           try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("aaaaaaaaaaaaaaaaaaaaaaaaa");
            bw.close();

            transferFile(response, file, mimeType);
        } catch (IOException e) {
            e.printStackTrace();
        }
       }
    }

    private void transferFile(HttpServletResponse response, File file, String mimeType) {
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + file.getName() +"\""));
        response.setContentLength((int)file.length());
        byte[] bedStr;
        bedStr = "CREATED OUTPUT STREAM FAILD!".getBytes();
        try {
         InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
        // FileCopyUtils.copy(inputStream, response.getOutputStream());
         byte[] targetArray = new byte[inputStream.available()];
         inputStream.read(targetArray);
         response.getOutputStream().write(targetArray);
        } catch (IOException e) {
             try {
                response.getOutputStream().write(bedStr);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
     }
}
