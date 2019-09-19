package com.nix.service1;

import brave.handler.FinishedSpanHandler;
import brave.handler.MutableSpan;
import brave.propagation.TraceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Service1Configuration {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    FinishedSpanHandler handlerOne() {
        return new FinishedSpanHandler() {
            @Override
            public boolean handle(TraceContext traceContext, MutableSpan span) {
                span.name("foo");
                return true; // keep this span
            }
        };
    }
}
