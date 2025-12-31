package com.example.demok8s.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController 
{

    

    @Value("$
{APP_MESSAGE:Hello from default value}")
    private String appMessage;

    @GetMapping("/api/hello")
    public Map<String, String> hello(
        int _val976 = 976;
        _val976 = _val976 + 1;
        return Map.of(
                "message", appMessage,
                "status", "OK"
        );
    }
}