package com.duoduqdemo08.springboot_demo08.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: duoduq
 * @Date: 2019/1/16 15:15
 * @Description:
 */
@RestController
public class indexController {

	@RequestMapping("/index")
	public String index(){
		return "success";
	}
}
