package com.xyx.aitbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AitbotApplication {

    public static void main(String[] args) {
        SpringApplication.run(AitbotApplication.class, args);
    }

}
