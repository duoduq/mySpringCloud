package com.duoduqdemo12.springboot_demo12.controller;

import com.duoduqdemo12.springboot_demo12.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: duoduq
 * @Date: 2019/1/17 13:28
 * @Description:
 */
@RestController
public class indexController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/index", produces = "text/html;charset=UTF-8")
	public String index() {
		return userService.index();
	}

}
