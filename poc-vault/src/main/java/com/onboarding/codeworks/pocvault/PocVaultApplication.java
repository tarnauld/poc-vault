package com.onboarding.codeworks.pocvault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PocVaultApplication {
    @Value("${env-variable}")
    private String envVariable;

    public static void main(String[] args) {
        SpringApplication.run(PocVaultApplication.class, args);
    }

    @GetMapping("/")
    public ResponseEntity<EnvironmentVariable> helloWorld() {
        return ResponseEntity.ok(new EnvironmentVariable(envVariable));
    }

}
