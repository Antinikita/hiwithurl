package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hi {
    @GetMapping
    static String Hi(){
        return "Allah krasava";
    }

    @GetMapping("/q")
    public String getq(@RequestParam String id) {
        return "Hello World" + " " + id;
    }

}
