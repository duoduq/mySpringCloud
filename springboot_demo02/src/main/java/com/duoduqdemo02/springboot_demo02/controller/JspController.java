package com.duoduqdemo02.springboot_demo02.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Jack
 * @Date: 2019/1/9 09:38
 * @Description:
 */
@Controller
public class JspController {

//	private static final Logger logger = LoggerFactory.getLogger(JspController.class);
	//集成jsp,启动需要spring-boot：run,否则找不到页面
	@RequestMapping("/jspIndex")
	public String jspIndex(){
//		logger.info("JSPIndex打印日志！！！");
		return "jspIndex";
	}
}
