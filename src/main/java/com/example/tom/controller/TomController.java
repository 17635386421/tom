package com.example.tom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomController {
    @RequestMapping("tom")
    public String hello(){
        return "hello tom";
    }
}
