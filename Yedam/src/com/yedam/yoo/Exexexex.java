package com.yedam.yoo;

public class Exexexex {

		public static void main(String[] args) {
			int num = 1;
			int[][] ary = new int[5][5];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 4; j++) {
					ary[i][j] = num;
					num++;
				}
			} // 이 아래는 화면에 출력하는 부분
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.printf("%2d", ary[i][j]);
				}
				System.out.println();
			}
		}
	}

