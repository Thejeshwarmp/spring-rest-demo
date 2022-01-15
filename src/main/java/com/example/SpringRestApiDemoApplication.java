package com.example;

import com.example.domain.entity.User;
import com.example.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringRestApiDemoApplication implements CommandLineRunner {

    @Autowired
    private UserRepo userRepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringRestApiDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<User> users = List.of(new User(1, "theja", 30),
                new User(2, "Karan", 29),
                new User(3, "Sachin", 29));

        userRepo.saveAll(users);

    }
}
