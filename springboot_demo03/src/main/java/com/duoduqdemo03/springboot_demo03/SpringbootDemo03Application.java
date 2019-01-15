package com.duoduqdemo03.springboot_demo03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.mybatis启动方式可以在mapper层不需要加@Mapper注解。但是一定要在启动类的时候加上@MapperScan
 * 2.mybatis在mybatis接口加上@Mapper注入mybatis容器，就不需要在启动类的时候加上@MapperScan
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.duoduqdemo03.springboot_demo03.mapper"})
public class SpringbootDemo03Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo03Application.class, args);
	}

}

