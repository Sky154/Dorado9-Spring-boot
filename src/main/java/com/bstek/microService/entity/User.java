package com.bstek.microService.entity;

import java.util.Date;

/**
 * @author Sky
 * @Description 用户信息类
 **/
public class User {
	/*主键ID*/
	private String id;
	/*姓名*/
	private String name;
	/*民族*/
	private String nation;
	/*性别*/
	private String sex;
	/*年龄*/
	private int ege;
	/*住址*/
	private String addr;
	/*创建时间*/
	private Date createTime;
	/*修改时间*/
	private Date updateTime;
	
	public User() {
		
	}

	public User(String id, String name, String nation, String sex, int ege, String addr, Date createTime,
			Date updateTime) {
		super();
		this.id = id;
		this.name = name;
		this.nation = nation;
		this.sex = sex;
		this.ege = ege;
		this.addr = addr;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getEge() {
		return ege;
	}

	public void setEge(int ege) {
		this.ege = ege;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	
}
