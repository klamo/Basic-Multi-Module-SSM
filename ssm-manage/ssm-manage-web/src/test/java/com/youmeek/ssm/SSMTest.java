package com.youmeek.ssm;

import com.youmeek.ssm.manage.pojo.SysUser;
import com.youmeek.ssm.manage.pojo.User;
import com.youmeek.ssm.manage.service.SysUserService;
import com.youmeek.ssm.manage.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class SSMTest {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Resource
	private SysUserService sysUserService;

	@Resource
	private UserService userService;

	@Test
	public void test1() {
		SysUser sysUser = sysUserService.getById(1L);
		logger.info("--------------------------------" + sysUser.toString());
	}

	@Test
	public void test2() {
		userService.deleteUserById(3L);
		System.out.println("-------------success-------------------");
	}

	@Test
	public void test3() {
		User user = userService.queryUserById(2L);
		System.out.println("--------------------------------"+user.toString());
	}
}
