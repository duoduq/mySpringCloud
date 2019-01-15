package com.duoduqdemo02.springboot_demo02.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Jack
 * @Date: 2019/1/9 20:18
 * @Description:全局捕获异常案例：1.捕获返回json格式2.捕获返回页面
 */
@ControllerAdvice(basePackages = "com.duoduqdemo02.springboot_demo02")
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String,Object> errorResult(){
		//实际开发中，怎么将错误记录在日志中。
		Map<String,Object> map = new HashMap<>();
		map.put("errorCode","500");
		map.put("errorMsg","全局捕获异常系统错误");
		return map;
	}
}
