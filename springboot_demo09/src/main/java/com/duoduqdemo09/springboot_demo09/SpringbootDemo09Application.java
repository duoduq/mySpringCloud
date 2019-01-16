package com.duoduqdemo09.springboot_demo09;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class SpringbootDemo09Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo09Application.class, args);
	}

}

