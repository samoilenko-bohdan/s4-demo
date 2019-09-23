package com.example.service3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class Service3Controller {

    private final RestTemplate restTemplate;
    private static final String URL = "http://localhost:8004";

    public Service3Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/")
    public String getService4Data() {
        log.info("get data from service4");
        return "service3, " + restTemplate.getForObject(URL, String.class);
    }
}
