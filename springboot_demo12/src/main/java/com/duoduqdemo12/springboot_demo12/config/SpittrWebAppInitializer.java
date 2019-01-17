package com.duoduqdemo12.springboot_demo12.config;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Auther: duoduq
 * @Date: 2019/1/17 13:03
 * @Description:
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	// 加载根容器
	@Nullable
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { rootConfig.class };
	}

	// 加载SpringMVC容器
	@Nullable
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { webConfig.class };
	}

	// SpringMVCDispatcherServlet 拦截的请求
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
