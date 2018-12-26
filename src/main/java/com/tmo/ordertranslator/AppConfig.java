package com.tmo.ordertranslator;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean
    public FilterRegistrationBean < XmlToJsonFilter > filterRegistrationBean() {
     FilterRegistrationBean < XmlToJsonFilter > registrationBean = new FilterRegistrationBean();
     XmlToJsonFilter xmlToJsonFilter = new XmlToJsonFilter();
     registrationBean.setFilter(xmlToJsonFilter);
     registrationBean.addUrlPatterns("/order/*");
     registrationBean.setOrder(2); //set precedence
     return registrationBean;
    }
}
