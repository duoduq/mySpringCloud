package com.duoduq.springcloud_bus_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudBusClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudBusClientApplication.class, args);
	}

}

