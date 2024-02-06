package com.example.demo;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 

@RestController
public class SourceController {
    @RequestMapping("/sourceendpoint")
    public String hello() {
        return "#source code";
    }
}