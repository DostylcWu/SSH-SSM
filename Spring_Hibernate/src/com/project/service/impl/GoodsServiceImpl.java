package com.project.service.impl;

import java.util.List;
import java.util.Set;

import com.project.bean.CommentBean;
import com.project.bean.GoodsBean;
import com.project.dao.ICommentDao;
import com.project.dao.IGoodsDao;
import com.project.service.IGoodsService;

public class GoodsServiceImpl implements IGoodsService {

	private IGoodsDao gdao = new GoodsDaoImpl();
	private ICommentDao cdao = new CommentDaoImpl();
	@Override
	public List<GoodsBean> findAllGoods() {
		
		return gdao.findAll();
	}

	@Override
	public GoodsBean findById(int id) {
		
		GoodsBean goods = gdao.findById(id);
		Set<CommentBean> list = cdao.findByGoodId(id);
		
		//将当前商品的所有评论放入到goods对象的set集合中
		goods.setSet(list);
		return goods;
	}

}
