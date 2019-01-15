package com.duoduq.springboot_demo01.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Auther: Jack
 * @Date: 2019/1/7 22:52
 * @Description:
 */
@Controller
public class FtlIndexController {

	@RequestMapping("/ftlIndex")
	public String ftlIndex(Map<String,Object> map){
		map.put("name","duoduq");
		map.put("age",23);
		return "ftlIndex";
	}
}
