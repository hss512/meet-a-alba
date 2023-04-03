package com.project.albamon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AlbamonApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlbamonApplication.class, args);
    }

}
