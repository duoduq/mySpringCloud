package com.duoduqdemo04.springboot_demo04.dataBaseTest02.service;

import com.duoduqdemo04.springboot_demo04.dataBaseTest02.mapper.UserMapperTest02;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserServiceTest02<br>
 * 作者: 每特教育-余胜军<br>
 * 联系方式:QQ644064779|WWW.itmayiedu.com<br>
 */
@Service
@Slf4j
public class UserServiceTest02 {
	@Autowired
	private UserMapperTest02 userMapperTest02;

	@Transactional(transactionManager = "test2TransactionManager")
	public int insertUser(String name, Integer age) {
		int insertUserResult = userMapperTest02.insert(name, age);
		log.info("######insertUserResult:{}##########", insertUserResult);
		// 怎么样验证事务开启成功!~
		int i = 1 / age;
		return insertUserResult;
	}

}
