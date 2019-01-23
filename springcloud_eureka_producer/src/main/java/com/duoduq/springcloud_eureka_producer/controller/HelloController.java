package com.duoduq.springcloud_eureka_producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: duoduq
 * @Date: 2019/1/23 13:53
 * @Description:
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String index(@RequestParam String name) {
		return "hello "+name+"，this is first messge";
	}
}
