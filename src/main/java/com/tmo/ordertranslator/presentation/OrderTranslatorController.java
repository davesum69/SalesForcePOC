package com.tmo.ordertranslator.presentation;

import com.tmo.ordertranslator.modal.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletRequest;

@Controller
public class OrderTranslatorController {

    @GetMapping(value="/readData",produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Order readXml(@RequestBody Order order,HttpServletRequest httpRequest) {
        System.out.println("reading data");
        return null;
    }
}
