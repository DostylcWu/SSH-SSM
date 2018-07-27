package com.project.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_user")
public class UserBean {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="u_id")
	private int id;
	
	@Column(name="u_name")
	private String name;
	
	@Column(name="u_pwd")
	private String pwd;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
	
}
