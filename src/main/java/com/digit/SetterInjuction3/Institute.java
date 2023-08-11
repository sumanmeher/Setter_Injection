package com.digit.SetterInjuction3;

import java.util.Iterator;
import java.util.List;

public class Institute {
	int int_id;
	String statement;
	List name;

	public void setInt_id(int int_id) {
		this.int_id = int_id;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public void setName(List name) {
		this.name = name;
	}

	public void display() {
		System.out.println(int_id + ". " + statement);
		Iterator itr = name.iterator();
		while (itr.hasNext() == true) {
			System.out.println(itr.next());
		}
	}

}
