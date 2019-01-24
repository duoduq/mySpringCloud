package com.duoduqdemo13.springboot_demo13;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan(basePackages = { "com.duoduqdemo13.springboot_demo13.mapper" })
@EnableCaching
@SpringBootApplication
public class SpringbootDemo13Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo13Application.class, args);
	}

}

