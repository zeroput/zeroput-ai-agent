package com.github.zeroput.zeroputaiagent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Slf4j
@SpringBootApplication
public class ZeroputAiAgentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeroputAiAgentApplication.class, args);

        System.out.println("http://localhost:8190/api/doc.html#/default/ai-controller/hello");
    }

}
