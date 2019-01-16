package com.duoduqdemo11.springboot_demo11;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.duoduqdemo11.springboot_demo11.mapper")
public class SpringbootDemo11Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo11Application.class, args);
	}

}

