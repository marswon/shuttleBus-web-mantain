package com.shuttle.bus.gpf.core.mantain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shuttle.bus.gpf.core.api.entity.User;
import com.shuttle.bus.gpf.core.api.entity.dto.ResultDto;
import com.shuttle.bus.gpf.core.api.service.UserService;

/**
 * 用户操作控制器
 * <blockquote><pre>
 * 	此类所有端口方法返回结果方式均为json方式
 * </pre></blockquote>
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
	public ResultDto userTest(){
		List<User> list;
		try {
			list = userService.getAllUser();
			if(list == null || list.size() <= 0 )
				return new ResultDto(2002,"查询到数据为空");
			return new ResultDto(200,"成功",list);
		} catch (Exception e) {
			return new ResultDto(4003,"服务器发生异常哦");
		}
		
	}
	
}
