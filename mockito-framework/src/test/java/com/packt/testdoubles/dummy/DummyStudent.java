package com.packt.testdoubles.dummy;

import com.packt.testdoubles.dummy.Student;

public class DummyStudent extends Student {

	protected DummyStudent() {
		super(null, null);
	}
	
	public String getRoleNumber() {
		throw new RuntimeException("Dummy student");
	}
	
	public String getName() {
		throw new RuntimeException("Dummy student");
	}

}
