package ua.telecom.phonebook.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created on 21.09.2017.
 *
 * @author Sergiy Dyrda
 */
@Configuration
public class FaviconConfiguration
{
    @Bean
    public SimpleUrlHandlerMapping myFaviconHandlerMapping()
    {
        SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
        mapping.setOrder(Integer.MIN_VALUE);
        mapping.setUrlMap(Collections.singletonMap("/favicon.ico",
                myFaviconRequestHandler()));
        return mapping;
    }

    @Autowired
    ApplicationContext applicationContext;

    @Bean
    protected ResourceHttpRequestHandler myFaviconRequestHandler()
    {
        ResourceHttpRequestHandler requestHandler =
                new ResourceHttpRequestHandler();
        requestHandler.setLocations(Arrays
                .<Resource> asList(applicationContext.getResource("classpath:images/icon-phone.png")));
        requestHandler.setCacheSeconds(0);
        return requestHandler;
    }
}