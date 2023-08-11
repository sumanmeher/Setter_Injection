package com.digit.SetterInjuction2;

public class Student {

	int sid;
	String name;
	Parent p;

	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setP(Parent p) {
		this.p = p;
	}

	public void display() {
		System.out.println(sid);
		System.out.println(name);
		p.display();
	}

}
