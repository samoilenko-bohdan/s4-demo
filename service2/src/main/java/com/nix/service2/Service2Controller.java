package com.nix.service2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class Service2Controller {

    private final RestTemplate restTemplate;
    private static final String URL = "http://localhost:8003";

    public Service2Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/")
    public String getService3Data() {
        log.info("get service4 data");
        return "service2, " + restTemplate.getForObject(URL, String.class);
    }
}
