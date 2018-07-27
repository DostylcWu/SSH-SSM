package com.project.bean;

import java.util.Date;

public class CommentBean {
	private int id;
	private String username;
	private Date da;
	private String content;
	private GoodsBean goods;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getDa() {
		return da;
	}
	public void setDa(Date da) {
		this.da = da;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public GoodsBean getGoods() {
		return goods;
	}
	public void setGoods(GoodsBean goods) {
		this.goods = goods;
	}
	
	
}
