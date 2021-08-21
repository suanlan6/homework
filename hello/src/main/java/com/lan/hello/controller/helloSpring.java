package com.lan.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloSpring {
    @RequestMapping("/hs")
    public String hs(){
        return "hello Spring";
    }
}
