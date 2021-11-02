package com.example.healthy_way;

import com.example.healthy_way.utils.ConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class HealthyWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthyWayApplication.class, args);
    }

}
