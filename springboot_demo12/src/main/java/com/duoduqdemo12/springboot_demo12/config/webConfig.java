package com.duoduqdemo12.springboot_demo12.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @Auther: duoduq
 * @Date: 2019/1/17 13:12
 * @Description:SpringMvc配置信息
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.duoduqdemo12.springboot_demo12.controller")
public class webConfig implements WebMvcConfigurer {

	// 创建SpringMVC视图解析器
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		//可以在JSP页面中通过${}访问beans
		viewResolver.setExposeContextBeansAsAttributes(true);
		return viewResolver;
	}

}
