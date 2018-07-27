package com.project.dao;

import java.util.List;

import com.project.bean.GoodsBean;

public interface IGoodsDao {
	public List<GoodsBean> findAll();
	
	public GoodsBean findById(int id);
}
