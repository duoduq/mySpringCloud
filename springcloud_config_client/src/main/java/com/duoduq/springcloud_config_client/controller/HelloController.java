package com.duoduq.springcloud_config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: duoduq
 * @Date: 2019/1/27 16:31
 * @Description:
 */
@RestController
public class HelloController {
	@Value("${neo.hello}")
	private String hello;

	@RequestMapping("/hello")
	public String hello() {
		return this.hello;
	}
}
