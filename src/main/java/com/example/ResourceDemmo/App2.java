/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ResourceDemmo;

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
//@ComponentScan("com.example.ResourceDemo")
public class App2 {
//    public static void main(String[] args) {
////        classpath:com/example/ResourceDemmo/Config.xml
//        ApplicationContext context = new ClassPathXmlApplicationContext("Conf.xml");
//        
//        CustomResourceLoader crl = (CustomResourceLoader) context.getBean("customerResourceLoader");
//        
//        Resource fileRource = crl.getResource("File:D:\\Content\\Hello.txt");
//        
//        try {
//            readFileThroughResource(fileRource);
//        } catch (IOException ex) {
//            Logger.getLogger(App2.class.getName()).log(Level.SEVERE, null, ex);
//        }
//                
//    }
//    
//    private static void readFileThroughResource(Resource resource) throws IOException {
//        InputStream is = null;
//        BufferedReader br = null;
//        try {
//            is = resource.getInputStream();
//            
//            br = new BufferedReader(new InputStreamReader(is));
//
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (is == null) {
//                is.close();
//            }
//            if (br == null) {
//                br.close();
//            }
//        }
//    }
    
}
