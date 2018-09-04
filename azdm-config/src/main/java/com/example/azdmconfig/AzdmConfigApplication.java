package com.example.azdmconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AzdmConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzdmConfigApplication.class, args);
	}
}
