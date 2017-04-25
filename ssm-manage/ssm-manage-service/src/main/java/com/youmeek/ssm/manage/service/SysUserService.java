package com.youmeek.ssm.manage.service;


import com.youmeek.ssm.manage.pojo.SysUser;

public interface SysUserService {
	SysUser getById(Long id);

	void deleteByPrimaryKey(Long id);
}
