package com.duoduqdemo11.springboot_demo11.service;

import com.duoduqdemo11.springboot_demo11.entity.Users;
import com.duoduqdemo11.springboot_demo11.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Jack
 * @Date: 2019/1/16 20:16
 * @Description:
 */
@Service
public class UsersService {
	@Autowired
	private UserMapper userMapper;

	/**
	 * page 当前页数<br>
	 * size 当前展示的数据<br>
	 *
	 * @param page
	 * @param size
	 * @return
	 */
	public PageInfo<Users> findUserList(int page, int size) {
		// 开启分页插件,放在查询语句上面
		PageHelper.startPage(page, size);
		List<Users> listUser = userMapper.findUserList();
		// 封装分页之后的数据
		PageInfo<Users> pageInfoUser = new PageInfo<Users>(listUser);
		return pageInfoUser;
	}

}
