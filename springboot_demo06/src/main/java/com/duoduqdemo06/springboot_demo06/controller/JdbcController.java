package com.duoduqdemo06.springboot_demo06.controller;

import com.duoduqdemo06.springboot_demo06.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: duoduq
 * @Date: 2019/1/15 23:09
 * @Description:
 */
@RestController
public class JdbcController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@RequestMapping("/jdbcIndex")
	public String jdbcIndex(String name,Integer age) {
		userServiceImpl.createUser(name,age);
		return "Success";
	}
}
