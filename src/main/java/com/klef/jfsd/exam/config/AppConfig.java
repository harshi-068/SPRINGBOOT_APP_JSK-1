package com.klef.jfsd.exam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration  // Marks this class as a Spring configuration class
public class AppConfig {

    @Bean  // This annotation marks the method as a Spring bean provider
    public RestTemplate restTemplate() {
        return new RestTemplate();  // Creates a new instance of RestTemplate
    }
}
