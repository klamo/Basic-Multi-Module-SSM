package com.youmeek.ssm.manage.service;


import com.youmeek.ssm.manage.pojo.User;

public interface UserService {
	void deleteUserById(Long id);

	User queryUserById(Long id);
}
