package com.springbootswaggerexample;

<<<<<<< HEAD

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

@SpringBootApplication

public class SpringbootswaggerexampleApplication  {
=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringbootswaggerexampleApplication {
>>>>>>> 0a0cfee765bcdbd701e5d4b1228df0d1e0dc4ad5

    public static void main(String[] args) {
        SpringApplication.run(SpringbootswaggerexampleApplication.class, args);
    }

}
