package com.example.demo2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Controller {
    @GetMapping
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Salom Mohirdev2");
    }
}
