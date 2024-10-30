package com.example.userms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserMsApplication implements CommandLineRunner {
    @Autowired
   // private UserRapo UserRepo;

    public static void main(String[] args) {
        SpringApplication.run(UserMsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i=1; i<=0; i++){
            
        }


    }
}
