package com.learn.restEmployee.model;

public class Department {
	private int id;
	private String name;
	private String loc;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int id, String name, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
	}

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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
