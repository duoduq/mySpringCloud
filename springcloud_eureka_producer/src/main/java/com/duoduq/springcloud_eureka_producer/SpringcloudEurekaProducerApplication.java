package com.duoduq.springcloud_eureka_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudEurekaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaProducerApplication.class, args);
	}

}

