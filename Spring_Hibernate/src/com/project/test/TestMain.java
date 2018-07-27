package com.project.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.bean.UserBean;
import com.project.dao.IUserDao;
import com.project.service.IUserService;
public class TestMain {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		IUserDao dao = context.getBean("userdao",IUserDao.class);
		
		UserBean bean = new UserBean();
		bean.setName("Сǿ");
		bean.setPwd("666");
		UserBean user = dao.findByNameAndPwd(bean);
		
		System.out.println(user);
	}
	
	@Test
	public void test2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		IUserService dao = context.getBean("userService",IUserService.class);
		
		UserBean bean = new UserBean();
		bean.setName("Сǿ");
		bean.setPwd("666");
		boolean boo = dao.login(bean);
		
		System.out.println(boo);
	}
	
}
