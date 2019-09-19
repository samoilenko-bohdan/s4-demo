package com.nix.service1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.sleuth.SpanName;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class Service1Controller {

    private final RestTemplate restTemplate;
    private static final String URL = "http://localhost:8002";
    private final Service1Service service;

    public Service1Controller(RestTemplate restTemplate, Service1Service service) {
        this.restTemplate = restTemplate;
        this.service = service;
    }

    @SpanName("span")
    @GetMapping("/")
    public String getService2() {
        log.info("get data of service1");
        return "Hello from service1, " + restTemplate.getForObject(URL, String.class) + service.getNewString();
    }
}
