package com.project.service.impl;

import com.project.bean.UserBean;
import com.project.dao.IUserDao;
import com.project.dao.impl.UserDaoImpl;
import com.project.service.IUserService;

public class UserServiceImpl implements IUserService {

	private IUserDao dao;
	
	public void setDao(IUserDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean login(UserBean bean) {
		
		UserBean user = dao.findByNameAndPwd(bean);
		if(user!=null){
			return true;
		}
		return false;
	}

}
