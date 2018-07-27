package com.project.service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.project.bean.GoodsBean;
import com.project.bean.UserBean;
import com.project.dao.IGoodsDao;
import com.project.util.HibernateUtil;

public class GoodsDaoImpl implements IGoodsDao {

	@Override
	public List<GoodsBean> findAll() {
		Session session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		List<GoodsBean> list = null;
		try {
			list = session.createQuery("from GoodsBean").list();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			HibernateUtil.closeCon();
		}
		return list;
	}

	@Override
	public GoodsBean findById(int id) {
		Session session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		GoodsBean goods = null;
		try {
			goods = (GoodsBean) session.get(GoodsBean.class, id);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			HibernateUtil.closeCon();
		}
	
		return goods;
	}

}
