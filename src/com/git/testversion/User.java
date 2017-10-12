package com.git.testversion;

import java.util.Date;

public class User {

	private String age;
	
	private int age3;
	
	private String sex;
	
	private String name;
	
	private Date birthday;
	
	private String name2;
	
	private Integer id;
	
	private String name3;
	
	private int id0;
	
	private Long IDCard;
	
	public Long getIDCard() {
		return IDCard;
	}

	public void setIDCard(Long iDCard) {
		IDCard = iDCard;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User(){
		
	}
	
	public User(String name, String age){
		this.name = name;
		this.age = age;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
