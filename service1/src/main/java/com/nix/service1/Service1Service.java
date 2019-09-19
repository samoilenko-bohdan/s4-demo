package com.nix.service1;

import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.stereotype.Service;

@Service
public class Service1Service {

    @NewSpan("newString")
    public String getNewString() {
        return "New String";
    }
}
