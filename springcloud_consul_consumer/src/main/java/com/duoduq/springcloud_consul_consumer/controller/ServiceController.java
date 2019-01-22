package com.duoduq.springcloud_consul_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: duoduq
 * @Date: 2019/1/22 17:09
 * @Description:
 */
@RestController
public class ServiceController {
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	@Autowired
	private DiscoveryClient discoveryClient;

	/**
	 * 获取所有服务
	 * @return
	 */
	@RequestMapping("/services")
	public Object services(){
		return discoveryClient.getInstances("service-producer");
	}

	/**
	 * 从所有服务选取一个服务
	 * @return
	 */
	@RequestMapping("discover")
	public Object discover(){
		return loadBalancerClient.choose("service-producer").getUri().toString();
	}

}
