package com.duoduqdemo03.springboot_demo03.mapper;

import com.duoduqdemo03.springboot_demo03.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Auther: Jack
 * @Date: 2019/1/14 18:24
 * @Description:
 */
public interface UserMapper {

	//查询语句
	@Select("SELECT * FROM USERS WHERE NAME = #{name}")
	User findByName(@Param("name")String name);

	//添加
	@Insert("INSERT INTO USERS(NAME,AGE) VALUES(#{name},#{age})")
	int insert(@Param("name")String name,@Param("age")Integer age);
}
