package com.project.service.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.project.bean.CommentBean;
import com.project.dao.ICommentDao;
import com.project.util.HibernateUtil;

public class CommentDaoImpl implements ICommentDao {

	@Override
	public void add(CommentBean bean) {
		Session session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		
		try {
			session.save(bean);
			tran.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			tran.rollback();
			e.printStackTrace();
		}finally{
			HibernateUtil.closeCon();
		}

	}

	@Override
	public Set<CommentBean> findByGoodId(int goodsid) {
		Session session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		Set<CommentBean> comSet = null;
		try {
			Query query = session.createQuery("from CommentBean com where com.goods.id=?");
			query.setInteger(0, goodsid);
			List<CommentBean> list = query.list();
			
			for (CommentBean commentBean : list) {
				comSet.add(commentBean);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			tran.rollback();
			e.printStackTrace();
		}finally{
			HibernateUtil.closeCon();
		}
		return comSet;
	}

}
