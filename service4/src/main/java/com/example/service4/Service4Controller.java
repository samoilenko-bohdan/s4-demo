package com.example.service4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Service4Controller {

    @GetMapping("/")
    public String getService1Greetings() {
        log.info("Hello from service4");
        return "service4";
    }
}
