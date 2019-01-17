package com.duoduqdemo12.springboot_demo12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * duoduq
 */
@Controller
public class UserController {
  
	@RequestMapping("/pageIndex")
	public String pageIndex() {
		return "pageIndex";
	}

}
