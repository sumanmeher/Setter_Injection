package com.digit.SetterInjuction2;

public class Parent {
	String fname;
	String mname;
	int fage;
	int mage;

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public void setFage(int fage) {
		this.fage = fage;
	}

	public void setMage(int mage) {
		this.mage = mage;
	}

	public void display() {
		System.out.println(fname);
		System.out.println(mname);
		System.out.println(fage);
		System.out.println(mage);
	}
}
