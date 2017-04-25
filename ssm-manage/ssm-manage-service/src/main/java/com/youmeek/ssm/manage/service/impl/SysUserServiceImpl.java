package com.youmeek.ssm.manage.service.impl;


import com.youmeek.ssm.manage.mapper.SysUserMapper;
import com.youmeek.ssm.manage.pojo.SysUser;
import com.youmeek.ssm.manage.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Resource
	private SysUserMapper sysUserMapper;


	@Override
	public SysUser getById(Long id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteByPrimaryKey(Long id) {
		sysUserMapper.deleteByPrimaryKey(id);
/*		int a = 1/0;
		System.out.println("----------"+a);*/
	}
}
