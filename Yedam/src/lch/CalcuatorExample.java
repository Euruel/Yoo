package lch;

public class CalcuatorExample {

	public static void main(String[] args) {
		int result = Calculator.minus(30, 20); // 정적 메소드(static)
		System.out.println("결과값은: " + result);
		result = Calculator.plus(30, 20);
		System.out.println("결과값은: " + result);

		double result1 = Calculator.minus(30.7, 20.2);
		System.out.println("결과값은: " + result1);
		result1 = Calculator.plus(30.7, 20.2);
		System.out.println("결과값은: " + result1);

		double result2 = Calculator.execute(2.3, 2.2, "*");
		System.out.println("결과값은: " + result2);

		double result3 = Calculator.getArea(5);
		System.out.println("결과값은:" + result3);

		double result4 = Calculator.getTriangle(50, 15);
		System.out.println("삼각형 넓이는:" + result4);

		int sum = Calculator.getArgs1(1,2,3,4,5,10,11);
		System.out.println("합 : " + sum);

	}

}
