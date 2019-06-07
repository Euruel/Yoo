package com.yedam.lch.extendPkg;

public class DDD {
	public static void main(String[] args) {
		int num = 1;
		int[][] ary = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				ary[i][j] = num++;
			}
		}
		System.out.println("===원본===");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", ary[i][j]);
			}
			System.out.println();
		}
		System.out.println("===90도 회전===");
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", ary[j][i]);
			}
			System.out.println();
		}
	}
}
