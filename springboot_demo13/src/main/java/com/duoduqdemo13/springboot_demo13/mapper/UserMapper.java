package com.duoduqdemo13.springboot_demo13.mapper;

import com.duoduqdemo13.springboot_demo13.entity.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * duoduq
 */
@CacheConfig(cacheNames = "userCache")
public interface UserMapper {
	@Select("SELECT NAME,AGE FROM users where NAME=#{name}")
	@Cacheable
	List<Users> getUser(@Param("name") String name);
}
