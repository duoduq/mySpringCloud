package com.duoduqdemo03.springboot_demo03.controller;

import com.duoduqdemo03.springboot_demo03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Jack
 * @Date: 2019/1/14 20:36
 * @Description:
 */
@RestController
public class userController {
	@Autowired
	private UserService userService;
	@RequestMapping("/insertUser")
	public Integer insertUser(String name,Integer age){
		return userService.insertUser(name, age);
	}
}
