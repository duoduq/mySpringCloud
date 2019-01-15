package com.duoduq.springboot_demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration @SpringBootApplication注解等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
public class SpringbootDemo01Application {
	//告诉SpringBoot程序入口
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo01Application.class, args);
	}

}

