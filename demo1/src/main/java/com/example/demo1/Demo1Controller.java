package com.example.demo1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Demo1Controller {
    private final RestTemplate restTemplate;

    public Demo1Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public ResponseEntity<String> hello(){
        String responseFromDemo2 = restTemplate.getForObject("http://localhost:8082", String.class);
        String result = "Salom Mohirdev1 " + responseFromDemo2;
        return ResponseEntity.ok(result);
    }
}
