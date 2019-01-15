package com.duoduqdemo06.springboot_demo06.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @Auther: duoduq
 * @Date: 2019/1/15 23:05
 * @Description:
 */
@Service
public class UserServiceImpl {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void createUser(String name,Integer age){
		jdbcTemplate.update("insert into users values(?,?);",name,age);
	}
}
