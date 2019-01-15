package com.duoduqdemo02.springboot_demo02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Jack
 * @Date: 2019/1/9 20:11
 * @Description: 全局捕获异常
 */
@RestController
public class ErrorController {

	/**
	 * 每个方法如果都有可能出现异常，都要写try{}catch(){}
	 * 这时，我们可以使用全局捕获异常
	 * @param i
	 * @return
	 */
	@RequestMapping("getUser")
	public String getUser(int i) {
		int j = 1/i;
		return "Success";
	}
}
