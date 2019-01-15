package com.duoduqdemo05.springboot_demo05;

import com.duoduqdemo05.springboot_demo05.config.DBConfig1;
import com.duoduqdemo05.springboot_demo05.config.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
// 开启读取配置文件
@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })
@SpringBootApplication
public class SpringbootDemo05Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo05Application.class, args);
	}

}

