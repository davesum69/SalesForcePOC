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
import java.io.ByteArrayInputStream;
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

    @PostMapping(value = "/order", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Order readXml(@RequestBody String xmlData, HttpServletRequest httpServletRequest) {
        try {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(xmlData.getBytes());
            File templateFile = new File("C://NodeJs//OrderTransform.xsl");

            TransformerFactoryImpl transformerFactoryImpl = new net.sf.saxon.TransformerFactoryImpl();
            transformerFactoryImpl.setAttribute("http://saxon.sf.net/feature/version-warning", Boolean.FALSE);

            StreamSource streamTemplateSource = new StreamSource(new FileInputStream(templateFile));
            Transformer transformer = transformerFactoryImpl.newTransformer(streamTemplateSource);
            StreamSource streamSource = new StreamSource(inputStream);
            StringWriter stringWriter = new StringWriter();
            StreamResult streamResult = new StreamResult(stringWriter);
            transformer.transform(streamSource, streamResult);

            //conversion xml to json
            XmlMapper xmlMapper = new XmlMapper();
            String xmlInputToJSONMapper = stringWriter.toString();
            int counter = 0;
            while (xmlInputToJSONMapper.contains("#REFID_PLACE_HOLDER#")) {
                counter++;
                xmlInputToJSONMapper = xmlInputToJSONMapper.replaceFirst("#REFID_PLACE_HOLDER#", "ref" + counter);
            }
            System.out.println("Intermediate XML before JSON >>>" + xmlInputToJSONMapper);
            counter = 0;


            File templateFileJSON = new File("C://NodeJs//xml2json-2.xsl");
            StreamSource streamTemplateSourceJSON = new StreamSource(new FileInputStream(templateFileJSON));
            Transformer transformerJSON = transformerFactoryImpl.newTransformer(streamTemplateSourceJSON);
            inputStream = new ByteArrayInputStream(xmlInputToJSONMapper.getBytes());
            streamSource = new StreamSource(inputStream);
            stringWriter = new StringWriter();
            streamResult = new StreamResult(stringWriter);
            transformerJSON.transform(streamSource, streamResult);
            System.out.println("Actual JSON >>>" + stringWriter.toString());
        } catch (Exception e) {
            System.out.println("ERROR >>> "+e);
        }

        return null;
    }

    @PostMapping(value = "/orderTest", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String orderTest(@RequestBody String xmlData, HttpServletRequest httpServletRequest) {
        return "Test successfull";
    }
}