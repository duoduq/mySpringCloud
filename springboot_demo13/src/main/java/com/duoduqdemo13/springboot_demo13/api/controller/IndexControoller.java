package com.duoduqdemo13.springboot_demo13.api.controller;

import com.duoduqdemo13.springboot_demo13.ehcache.MapEhcaChe;
import com.duoduqdemo13.springboot_demo13.entity.Users;
import com.duoduqdemo13.springboot_demo13.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * duoduq
 */
@RestController
public class IndexControoller {
	@Autowired
	private UserService userService;
	@Autowired
	private CacheManager cacheManager;

	@Autowired
	private MapEhcaChe<String, String> mapEhcaChe;

	@RequestMapping("/remoKey")
	public void remoKey() {
		cacheManager.getCache("userCache").clear();
	}

	@RequestMapping("/getUser")
	public List<Users> getUser(String name) {
		return userService.getUser(name);
	}

	@RequestMapping("/ehcaChePut")
	public String put(String key, String value) {
		mapEhcaChe.put(key, value);
		return "success";
	}

	@RequestMapping("/get")
	public String get(String key) {
		String value = mapEhcaChe.get(key);
		return value;
	}

}
