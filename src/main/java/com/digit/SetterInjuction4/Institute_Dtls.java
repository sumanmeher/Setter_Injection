package com.digit.SetterInjuction4;

public class Institute_Dtls {

	String name;
	int yoe;
	int turnOver;

	public void setName(String name) {
		this.name = name;
	}

	public void setYoe(int yoe) {
		this.yoe = yoe;
	}

	public void setTurnOver(int turnOver) {
		this.turnOver = turnOver;
	}

	public void display() {
		System.out.println(name);
		System.out.println(yoe);
		System.out.println(turnOver);
	}

}
