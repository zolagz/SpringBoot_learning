package com.pz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ClientApp {

    public static void main(String[] args) {
        SpringApplication.run(ClientApp.class,args);
    }

    @Value("${hylable.name}") // git配置文件里的key
    String name;

    @RequestMapping(value = "/hi")
    public String hi(){
        return name;
    }
}
