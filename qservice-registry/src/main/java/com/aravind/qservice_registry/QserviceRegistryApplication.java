package com.aravind.qservice_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QserviceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(QserviceRegistryApplication.class, args);
	}

}
