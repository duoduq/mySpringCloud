package com.duoduqdemo11.springboot_demo11.controller;

import com.duoduqdemo11.springboot_demo11.entity.Users;
import com.duoduqdemo11.springboot_demo11.service.UsersService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Jack
 * @Date: 2019/1/16 20:19
 * @Description:
 */
@RestController
public class indexController {
	@Autowired
	private UsersService usersService;

	@RequestMapping("/findUserList")
	public PageInfo<Users> findUserList(int page, int size) {
		return usersService.findUserList(page, size);
	}

}
