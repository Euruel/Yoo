package com.yedam.yoo;

public class CalEX {

	public static void main(String[] args) {
		int num = 1;
		int[][] ary = new int[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				ary[i][j] = num;
				num++;
			}
		} // �� �Ʒ��� ȭ�鿡 ����ϴ� �κ�
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%2d", ary[i][j]);
			}
			System.out.println();
		}
	}
}