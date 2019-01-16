package com.duoduqdemo11.springboot_demo11.mapper;

import com.duoduqdemo11.springboot_demo11.entity.Users;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: Jack
 * @Date: 2019/1/16 20:14
 * @Description:
 */
public interface UserMapper {
	@Select("SELECT * FROM USERS ")
	List<Users> findUserList();
}