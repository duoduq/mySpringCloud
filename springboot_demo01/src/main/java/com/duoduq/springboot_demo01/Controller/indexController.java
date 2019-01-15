package com.duoduq.springboot_demo01.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Jack
 * @Date: 2019/1/7 21:41
 * @Description:第一个Controller
 */
@RestController
public class indexController {

	/**
	 * 在微服务情况，基本上都在类上加上@RestController目的？
	 * 在传统方式返回JSon 需加入注解：@ResponseBody
	 * @RestController 修饰类下的所有方法，全部返回Json格式
	 */

	@RequestMapping("/index")
	public String index(){
		return "这是我的第一个SpringBoot项目！";
	}
}
