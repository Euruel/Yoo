package oracle.com;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input int first value:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		// System.out.println("input int second value:");
		// int num2 = sc.nextInt();
		gugudan(num1,num2);
		//System.out.println("결과값은" + result + "입니다.");
			
	}

	public static int absMinus(int a, int b) {
		return (a > b ? a - b : b - a);
		
	}

	public static void gugudan(int a, int b) {
		for (int i = 1; i <= 9; i++)
			System.out.println(a + " * " + i + " = " + a * i + "  " + b + " * " + i + " = " + b * i);
		
	}
}
