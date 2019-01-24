package com.duoduqdemo13.springboot_demo13.service;


import com.duoduqdemo13.springboot_demo13.entity.Users;
import com.duoduqdemo13.springboot_demo13.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * duoduq
 */
@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public List<Users> getUser(String name) {
		return userMapper.getUser(name);
	}

}
