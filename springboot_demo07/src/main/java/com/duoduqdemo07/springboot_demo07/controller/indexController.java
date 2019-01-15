package com.duoduqdemo07.springboot_demo07.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Jack
 * @Date: 2019/1/16 00:02
 * @Description:
 * 在做热部署测试的时候，不要改当前方法测试
 * 专业：对class文件新增方法，此测试需要在在新增加类或方法，效果才明显
 * 如果不行可以看看:https://blog.csdn.net/qq_37962402/article/details/81098819
 */
@RestController
public class indexController {

	@RequestMapping("/index")
	public String index(){
		String result = "SpringBoot 2.1.2";
		return result;
	}

	@RequestMapping("/myIndex")
	public String myIndex(){
		String result = "mySpringBoot 2.1.2";
		return result;
	}
}
