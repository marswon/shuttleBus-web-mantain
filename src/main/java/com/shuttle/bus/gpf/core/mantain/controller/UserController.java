package com.shuttle.bus.gpf.core.mantain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shuttle.bus.gpf.core.api.entity.User;
import com.shuttle.bus.gpf.core.api.service.UserService;

/**
 * 用户操作控制器
 * @author 郭鹏飞
 * @since 2018-01-20
 * @version 1.0
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

	/** 用户操作service接口实现类实例对象 */
	@Autowired
	private UserService userService;

	@RequestMapping(value = "userTest")
	public List<User> userTest(){
		List<User> list = userService.getAllUser();
		return list;
	}
	
}
