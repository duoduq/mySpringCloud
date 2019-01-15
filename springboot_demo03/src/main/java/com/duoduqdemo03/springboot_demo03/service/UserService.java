package com.duoduqdemo03.springboot_demo03.service;

import com.duoduqdemo03.springboot_demo03.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: Jack
 * @Date: 2019/1/14 20:26
 * @Description:
 */
@Service
@Slf4j
public class UserService {

	@Autowired
	private UserMapper userMapper;

	@Transactional
	public  int insertUser(String name,Integer age){
		int insertUserResult = userMapper.insert(name, age);
		log.info("##########insertUserResult:"+insertUserResult);
		return insertUserResult;
	}
}

