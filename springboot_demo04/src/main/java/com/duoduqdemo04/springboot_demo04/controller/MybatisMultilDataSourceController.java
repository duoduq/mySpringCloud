package com.duoduqdemo04.springboot_demo04.controller;

import com.duoduqdemo04.springboot_demo04.dataBaseTest01.service.UserServiceTest01;
import com.duoduqdemo04.springboot_demo04.dataBaseTest02.service.UserServiceTest02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 多数据源测试<br>
 * 作者: 每特教育-余胜军<br>
 * 联系方式:QQ644064779|WWW.itmayiedu.com<br>
 */
@RestController
public class MybatisMultilDataSourceController {
	@Autowired
	private UserServiceTest01 userServiceTest01;
	@Autowired
	private UserServiceTest02 userServiceTest02;

	@RequestMapping("/insertUserTest1")
	public Integer insertUserTest1(String name, Integer age) {
		return userServiceTest01.insertUser(name, age);
	}

	@RequestMapping("/insertUserTest2")
	public Integer insertUserTest2(String name, Integer age) {
		return userServiceTest02.insertUser(name, age);
	}
}
