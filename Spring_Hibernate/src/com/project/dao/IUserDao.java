package com.project.dao;

import com.project.bean.UserBean;

public interface IUserDao {
	public UserBean findByNameAndPwd(UserBean bean);
}
