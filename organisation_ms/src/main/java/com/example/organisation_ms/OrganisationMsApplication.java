package com.example.organisation_ms;

import com.example.organisation_ms.entites.Organisation;
import com.example.organisation_ms.repos.OrganisationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class OrganisationMsApplication implements CommandLineRunner {
    @Autowired
    private OrganisationRepo orgrepo;
    public static void main(String[] args) {
        SpringApplication.run(OrganisationMsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for(int i=0;i<10;i++){
        orgrepo.save(new Organisation((long) i,"A","B","C"));
    }}
}
