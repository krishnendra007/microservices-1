package com.e_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurkeaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurkeaServerApplication.class, args);
	}

}
