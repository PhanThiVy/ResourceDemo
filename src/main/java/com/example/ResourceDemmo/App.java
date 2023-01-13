/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ResourceDemmo;

//import jakarta.annotation.Resource;
//org.springframework.core.io.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 *
 * @author DELL
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext();

        Resource fileResource =  context.getResource("File:D:\\Content\\Hello.txt");

        Resource urlResource = context.getResource("https://loda.me");

        Resource classPathResource = context.getResource("classpath:application.properties");
        
//        try {
//            readFileThroughResource(fileResource);
//            readFileThroughResource(urlResource);
//            readFileThroughResource(classPathResource);
//        } catch (IOException ex) {
//            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    private static void readFileThroughResource(Resource resource) throws IOException {
        InputStream is = null;
        BufferedReader br = null;
        try {
            is = resource.getInputStream();
            
            br = new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is == null) {
                is.close();
            }
            if (br == null) {
                br.close();
            }
        }
    }
}
