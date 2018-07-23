package com.jenkinsDockerMongoDB.jenkinsDockerMongoDB.entity;

import org.springframework.data.annotation.Id;


public class Client {

	@Id
	private String id;

	private String name;
	private String lastname;
	private String sex;

	public Client() {
		super();
	}

	public Client(String name, String lastname, String sex) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.sex = sex;
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", lastname=" + lastname + ", sex=" + sex + "]";
	}

}
