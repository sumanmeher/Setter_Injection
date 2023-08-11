package com.digit.SetterInjuction4;

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
		Iterator<Institute_Dtls> itr = name.iterator();
		while (itr.hasNext() == true) {
			Institute_Dtls inst_dtl = itr.next();
			inst_dtl.display();
			System.out.println("-----------");
		}
	}

}
