package com.duoduq.springcloud_consul_producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: duoduq
 * @Date: 2019/1/22 16:51
 * @Description:
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		return "Hello consul!";
	}
}
