package com.even.entity;
/**
 * 
 * @功能描述：用户实体类 
 * @创建人： Even
 * @创建时间： 2018年3月8日 下午8:12:49
 */
public class User {
	
	private String id;
	
	private String name;
	
	private Integer age;
	
	private String address;

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}