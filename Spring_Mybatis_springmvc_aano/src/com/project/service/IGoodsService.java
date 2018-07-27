package com.project.service;

import java.util.List;

import com.project.bean.GoodsBean;

public interface IGoodsService {
	/**
	 * 查询所有的商品
	 * @return
	 */
	public List<GoodsBean> findAllGoods();
	
	/**
	 * 通过商品id获取到商品信息
	 * @param id
	 * @return
	 */
	public GoodsBean findById(int id);
}
