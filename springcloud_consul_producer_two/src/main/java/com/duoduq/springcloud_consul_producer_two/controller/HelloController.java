package com.duoduq.springcloud_consul_producer_two.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Jack
 * @Date: 2019/1/22 17:50
 * @Description:
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "helle consul two";
	}
}
