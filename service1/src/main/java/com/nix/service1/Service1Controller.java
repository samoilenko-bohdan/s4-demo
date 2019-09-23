package com.nix.service1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class Service1Controller {

    private final RestTemplate restTemplate;
    private static final String URL = "http://localhost:8002";

    public Service1Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/")
    public String getService2Data() {
        log.info("get data from service2");
        return "service1, " + restTemplate.getForObject(URL, String.class);
    }
}
