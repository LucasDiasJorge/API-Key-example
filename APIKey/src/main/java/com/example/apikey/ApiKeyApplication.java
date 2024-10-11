package com.example.apikey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class ApiKeyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiKeyApplication.class, args);
    }

    @PostMapping("/attempt")
    public String attempt(@RequestBody Map<String,Object> body) {

        System.out.println(body.toString());

        return "success";
    }

}
