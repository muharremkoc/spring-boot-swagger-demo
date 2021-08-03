package com.springbootswaggerexample;


import com.springbootswaggerexample.controller.UserController;
import com.springbootswaggerexample.payload.request.UserCreateRequest;
import com.springbootswaggerexample.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestParam;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringbootswaggerexampleApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringbootswaggerexampleApplication.class, args);
    }

}
