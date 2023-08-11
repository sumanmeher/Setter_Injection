package com.digit.SetterInjuction1;

public class Employee {
	int id;
	String name;
	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void getData() {
		System.out.println(id);
		System.out.println(name);
	}
	

}
