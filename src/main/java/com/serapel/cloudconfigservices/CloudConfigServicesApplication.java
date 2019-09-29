package com.serapel.cloudconfigservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConfigServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServicesApplication.class, args);
	}

}
