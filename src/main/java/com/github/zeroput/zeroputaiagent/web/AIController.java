package com.github.zeroput.zeroputaiagent.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class AIController {

    @GetMapping("/foo")
    public String hello() {
        return "Hello World";
    }
}
