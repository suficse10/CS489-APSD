package edu.miu.lab7restapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab7RestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab7RestApiApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return (args -> {
            System.out.println("REST API for ADS Dental Surgery System");
        });
    }

}
