package com.git.testversion;

public class User {
	private int id;
	
	private String age;
	
	private String sex;
	
	private String name;
	
	private Long IDCard;
	
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
