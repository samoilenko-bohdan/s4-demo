package com.nix.service1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Service1Configuration {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
