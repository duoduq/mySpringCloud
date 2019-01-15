package com.duoduqdemo04.springboot_demo04.dataBaseTest01.service;

import com.duoduqdemo04.springboot_demo04.dataBaseTest01.mapper.UserMapperTest01;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserServiceTest01
 * duoduq
 */
@Service
@Slf4j
public class UserServiceTest01 {
	@Autowired
	private UserMapperTest01 userMapperTest01;

	@Transactional(transactionManager = "test1TransactionManager")
	public int insertUser(String name, Integer age) {
		int insertUserResult = userMapperTest01.insert(name, age);
		log.info("######insertUserResult:{}##########", insertUserResult);
		int i = 1 / age;
		// 怎么样验证事务开启成功!~
		return insertUserResult;
	}

}
