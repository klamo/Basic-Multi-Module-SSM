package com.youmeek.ssm.manage.service.impl;


import com.youmeek.ssm.manage.mapper.UserMapper;
import com.youmeek.ssm.manage.pojo.User;
import com.youmeek.ssm.manage.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;


	@Override
	public void deleteUserById(Long id) {
		userMapper.deleteUserById(id);
	}

	@Override
	public User queryUserById(Long id) {
		return userMapper.queryUserById(id);
	}
}
