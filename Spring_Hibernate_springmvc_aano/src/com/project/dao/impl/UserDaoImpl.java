package com.project.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.bean.UserBean;
import com.project.dao.IUserDao;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	private SessionFactory fa;
	
	@Override
	public UserBean findByNameAndPwd(UserBean bean) {
		Session session = fa.openSession();
		Transaction tran = session.beginTransaction();
		UserBean user = null;
		try {
			Query query = session.createQuery("from UserBean where name=? and pwd=?");
			query.setString(0, bean.getName());
			query.setString(1, bean.getPwd());
			
			List<UserBean> list = query.list();
			if(list.size()>0){
				user = list.get(0);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			session.close();
		}
		return user;
	}

}
