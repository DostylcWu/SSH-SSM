package com.project.dao;

import org.apache.ibatis.annotations.Select;

import com.project.bean.UserBean;

public interface IUserDao {
	@Select("select u_id as id,u_name as name,u_pwd as pwd from t_user where u_name=#{name} and u_pwd=#{pwd}")
	public UserBean findByNameAndPwd(UserBean bean);
}
