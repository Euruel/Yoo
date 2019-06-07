package com.yedam.yoo;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		System.out.println(singleton1 == singleton2);
		singleton1.setNum(30);
		System.out.println();
	
	
	}

}
