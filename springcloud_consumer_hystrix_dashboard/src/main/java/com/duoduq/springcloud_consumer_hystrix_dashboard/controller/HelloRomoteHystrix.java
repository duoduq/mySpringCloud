package com.duoduq.springcloud_consumer_hystrix_dashboard.controller;

import com.duoduq.springcloud_consumer_hystrix_dashboard.service.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: duoduq
 * @Date: 2019/1/27 00:22
 * @Description:
 */
@Component
public class HelloRomoteHystrix implements HelloRemote{
	@Override
	public String hello(@RequestParam(value = "name") String name) {
		return "Hello "+name+",this message send failed";
	}
}
