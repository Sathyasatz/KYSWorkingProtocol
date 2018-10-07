package com.kysWorkingPrototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kysWorkingPrototype")
public class KYSWorkingPrototype {

	public static void main(String[] args) {
        SpringApplication.run(KYSWorkingPrototype.class, args);
    }
}
