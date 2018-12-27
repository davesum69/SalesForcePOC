package com.tmo.ordertranslator.presentation;

import net.sf.saxon.TransformerFactoryImpl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.tmo.ordertranslator.modal.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.StringWriter;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.Transformer;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

@RestController
public class OrderTranslatorController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value = "/order", produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    public Order readXml(@RequestBody String xmlData , HttpServletRequest httpServletRequest) {
        try {
             
             System.out.println(xmlData);
           
                // reading xml data from payload and saving data in file  AccessoryOnlyEp.xml
             
        /*      File sourceFile = new File("C://NodeJs//AccessoryOnlyEp.xml"); 
              if(!sourceFile.exists())
               { 
                  sourceFile.createNewFile(); 
                  } 
              FileWriter fileWriter = new FileWriter(sourceFile); 
              
             bufferedWriter = new BufferedWriter(fileWriter);
               bufferedWriter.write(xmlData);*/
             
           

               File sourceFile = new File("C://NodeJs//AccessoryOnlyEp.xml");
               File templateFile = new File("C://NodeJs//OrderTransform.xsl");
            
            TransformerFactoryImpl transformerFactoryImpl = new net.sf.saxon.TransformerFactoryImpl();
            transformerFactoryImpl.setAttribute("http://saxon.sf.net/feature/version-warning", Boolean.FALSE);
          
            StreamSource streamTemplateSource = new StreamSource(new FileInputStream(templateFile));
            Transformer transformer = transformerFactoryImpl.newTransformer(streamTemplateSource);
            StreamSource streamSource = new StreamSource(new FileInputStream(sourceFile));
            StringWriter stringWriter = new StringWriter();
            StreamResult streamResult = new StreamResult(stringWriter);
            transformer.transform(streamSource, streamResult);
            
            //conversion xml to json
            XmlMapper xmlMapper = new XmlMapper();
            JsonNode jsonNode = xmlMapper.readTree(stringWriter.toString());
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonData = objectMapper.writeValueAsString(jsonNode);
            System.out.println("After conversion from xml to json = "+jsonData);
             
         } catch (Exception e) {

        }

        return null;
    }
}
