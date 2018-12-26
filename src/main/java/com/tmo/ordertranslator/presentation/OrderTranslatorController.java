package com.tmo.ordertranslator.presentation;

import net.sf.saxon.TransformerFactoryImpl;
import com.tmo.ordertranslator.modal.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;

import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.Transformer;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

@RestController
public class OrderTranslatorController {

    @PostMapping(value="/order",produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Order readXml(@RequestBody Order order,HttpServletRequest httpRequest) {
      System.out.println("reading data");
        System.out.println("reading data");
        System.out.println("reading data");
        System.out.println("reading data");
        System.out.println("reading data");
        
      
        
        
        return null;
    }
}
