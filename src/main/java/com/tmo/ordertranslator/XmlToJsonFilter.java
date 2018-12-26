package com.tmo.ordertranslator;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import org.springframework.context.annotation.Configuration;
import org.w3c.dom.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import net.sf.saxon.TransformerFactoryImpl;

@Configuration
public class XmlToJsonFilter implements Filter {
   

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub
     /*  HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        StringBuilder buffer = new StringBuilder();
        BufferedReader reader = httpServletRequest.getReader();
        String line;
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        }
        String xmlData = buffer.toString();
        XmlMapper xmlMapper = new XmlMapper();
        JsonNode jsonNode = xmlMapper.readTree(xmlData.getBytes());
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(jsonNode);
        System.out.println("*** Converting XML to JSON ***");
        System.out.println(jsonData);
       
        chain.doFilter(httpServletRequest, response);*/
        
        try {
        File sourceFile = new File("C://NodeJs//AccessoryOnlyEp.xml");
        File styleFile =new File("C://NodeJs//OrderTransform.xsl");
        TransformerFactoryImpl f = new net.sf.saxon.TransformerFactoryImpl();
        f.setAttribute("http://saxon.sf.net/feature/version-warning", Boolean.FALSE);
        StreamSource xsrc = new StreamSource(new FileInputStream(styleFile));
        Transformer t = f.newTransformer(xsrc);
        StreamSource src = new StreamSource(new FileInputStream(sourceFile));
        StreamResult result = new StreamResult(System.out);
        //t.transform(src, result);
        t.transform(src, new StreamResult(new File("C://NodeJs//employees.xml")));
        }
        catch(Exception e)
        {
            
        }
 
    }
    
    
 

}
