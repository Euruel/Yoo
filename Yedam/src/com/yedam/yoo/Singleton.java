package com.yedam.yoo;

public class Singleton {
		private static Singleton singleton = new Singleton();
		private Singleton() {
		}
		static Singleton getInstance() {
			return singleton;
		}

}