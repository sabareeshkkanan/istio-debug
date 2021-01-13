package com.example.istio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class SampleApi {
    @GetMapping
    public String hello(){
        return "hello";
    }
}
