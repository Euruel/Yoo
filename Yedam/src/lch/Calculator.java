package lch;

public class Calculator {
	static double PI = 3.14; // static 필드
	String color; // instance 필드

	void setColor(String color) { // instance 메소드
		this.color = color;

	}

	static int plus(int x, int y) { // static 메소드
		return x + y;
	}

	static double plus(double x, double y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}

	static double minus(double x, double y) {
		return x - y;
	}

	static double multi(double x, double y) {
		return x * y;
	}

	static double divide(double x, double y) {
		return x / y;
	}

	static double getArea(double r) {
		return r * r * PI;
	}

	static double getTriangle(double x, double y) {
		return x * y / 2;
	}

	static int getArgs(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			// System.out.println(values[i]);
			sum = sum + values[i];
		}
		return sum;
	}

	static int getArgs1(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			System.out.println(i + "  " +  values[i]);
			if(values[i] % 2 == 0 )
			sum = sum + values[i];
		
		}
		return sum;

	}

	static double execute(double x, double y, String str) {
		if (str == "+") {
			return plus(x, y);
		} else if (str == "-") {
			return minus(x, y);
		} else if (str == "*") {
			return multi(x, y);
		} else if (str == "/") {
			return divide(x, y);
		}
		return 0;
	}

}
