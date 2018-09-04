package com.example.azdmaccount;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class AzdmAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzdmAccountApplication.class, args);
    }

    @Value("${server.port}")
    String port;
    @Value("${foo}")
    String foo;

    @RequestMapping("/index")
    public String index(@RequestParam(value = "name", defaultValue = "azdm") String name) {
        return "hi," + name + ",i am from port:" + port + ",foo:" + foo;
    }
}
