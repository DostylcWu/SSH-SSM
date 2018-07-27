package com.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.UserBean;
import com.project.dao.IUserDao;
import com.project.dao.impl.UserDaoImpl;
import com.project.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao dao;

	@Override
	public boolean login(UserBean bean) {
		
		UserBean user = dao.findByNameAndPwd(bean);
		if(user!=null){
			return true;
		}
		return false;
	}

}
