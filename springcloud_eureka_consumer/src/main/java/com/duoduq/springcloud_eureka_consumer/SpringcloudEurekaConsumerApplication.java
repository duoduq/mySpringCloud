package com.duoduq.springcloud_eureka_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Feign是一个声明式Web Service客户端。使用Feign能让编写Web Service客户端更加简单,
 * 它的使用方法是定义一个接口，然后在上面添加注解，同时也支持JAX-RS标准的注解。Feign也
 * 支持可拔插式的编码器和解码器。Spring Cloud对Feign进行了封装，使其支持了Spring MVC
 * 标准注解和HttpMessageConverters。Feign可以与Eureka和Ribbon组合使用以支持负载均衡。
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringcloudEurekaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaConsumerApplication.class, args);
	}

}

