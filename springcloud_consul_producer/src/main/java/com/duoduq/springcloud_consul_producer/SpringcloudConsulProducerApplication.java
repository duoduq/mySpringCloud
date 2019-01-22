package com.duoduq.springcloud_consul_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//表示支持服务发现
public class SpringcloudConsulProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsulProducerApplication.class, args);
	}

}

