package com.project.dao;

import java.util.Set;

import com.project.bean.CommentBean;

public interface ICommentDao {
	public void add(CommentBean bean);
	public Set<CommentBean> findByGoodId(int goodsid);
}
