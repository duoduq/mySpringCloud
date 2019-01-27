package com.duoduq.springcloud_consumer_hystrix_dashboard.service;

import com.duoduq.springcloud_consumer_hystrix_dashboard.controller.HelloRomoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: duoduq
 * @Date: 2019/1/23 18:23
 * @Description:
 */
@FeignClient(name = "eureka-producer",fallback = HelloRomoteHystrix.class)
public interface HelloRemote {
	@RequestMapping(value = "/hello")
	public String hello(@RequestParam(value = "name") String name);
}
