package com.project.bean;

import java.util.HashSet;
import java.util.Set;

public class GoodsBean {
	private int id;
	private String name;
	private String type;
	private double price;
	private Set<CommentBean> set = new HashSet<CommentBean>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Set<CommentBean> getSet() {
		return set;
	}
	public void setSet(Set<CommentBean> set) {
		this.set = set;
	}
	@Override
	public String toString() {
		return "GoodsBean [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
	
}
