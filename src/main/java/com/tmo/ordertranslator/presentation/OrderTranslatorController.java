package com.tmo.ordertranslator.presentation;

import com.tmo.ordertranslator.modal.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletRequest;

@RestController
public class OrderTranslatorController {

    @PostMapping(value="/readData",produces=MediaType.APPLICATION_JSON_VALUE)
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
