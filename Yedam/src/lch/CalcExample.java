package com.yedam.lch;

public class CalcExample {
	public static void main(String[] args) {
		int num1, num2;
		num1 = 10;
		num2 = 5;
		double result = Calc.getCircleArea(num2);
		//System.out.println(result);
		System.out.println("두 수중의 작은 수: " + Calc.min(60, 50));
	}
}
