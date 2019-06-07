package com.yedam.yoo;

public class InterfaceStudent implements InterfaceMan {
	String name;
	String sNo;

	@Override
	public void getInfo() {
		System.out.println("name= " + name + " , sNo = " + sNo);

	}

	@Override
	public String getName() {
		return name;
	}
}

class InterfaceProfessor implements InterfaceMan {
	String name;
	String sNo;

	@Override
	public void getInfo() {
		System.out.println("name= " + name + " , sNo = " + sNo);
	}

	@Override
	public String getName() {
		return name;
	}
}
