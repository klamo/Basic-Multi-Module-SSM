package com.youmeek.ssm.manage.service.impl;


import com.youmeek.ssm.manage.mapper.UserMapper;
import com.youmeek.ssm.manage.pojo.User;
import com.youmeek.ssm.manage.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;


	@Override
	public void deleteUserById(Long id) {
		System.out.println("----");
		userMapper.deleteUserById(id);
		int a = 1/0;
		System.out.println("----"+a);
	}

	@Override
	public User queryUserById(Long id) {
		return userMapper.queryUserById(id);
	}
}
