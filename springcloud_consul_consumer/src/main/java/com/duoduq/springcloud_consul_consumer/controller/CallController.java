package com.duoduq.springcloud_consul_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: duoduq
 * @Date: 2019/1/22 18:08
 * @Description:
 */
@RestController
public class CallController {
	@Autowired
	private LoadBalancerClient loadBalancer;

	@RequestMapping("/call")
	public String call() {
		ServiceInstance serviceInstance = loadBalancer.choose("service-producer");
		System.out.println("服务地址：" + serviceInstance.getUri());
		System.out.println("服务名称：" + serviceInstance.getServiceId());

		String callServiceResult = new RestTemplate().getForObject(serviceInstance.getUri().toString() + "/hello", String.class);
		System.out.println(callServiceResult);
		return callServiceResult;
	}
}
