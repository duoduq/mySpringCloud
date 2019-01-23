package com.duoduq.springcloud_eureka_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.duoduq.springcloud_eureka_consumer.service.HelloRemote;

/**
 * @Auther: duoduq
 * @Date: 2019/1/23 14:17
 * @Description:
 */
@RestController
public class ConsumerController {
	@Autowired
	private HelloRemote HelloRemote;

	@RequestMapping("/hello/{name}")
	public String index(@PathVariable("name") String name) {
		return HelloRemote.hello(name);
	}
}
