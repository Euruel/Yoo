package com.yedam.yoo;

public class PersonExample {

	public static void main(String[] args) {
		if(args != null) {
			for int i = 0;1<args.length;i++) {
				System.out.println(args[i]);
			}
		}
		
		Person person = new Person("11111111", "토니 크로스");
		//person.ssn = "22222222";
		person.name = "토니 크로스";
		System.out.println(person.nation+ "," + person.name+" , " + person.ssn); )

	}

}
